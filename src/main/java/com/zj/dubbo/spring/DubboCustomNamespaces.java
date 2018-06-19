package com.zj.dubbo.spring;

import com.intellij.spring.dom.CustomNamespaceRegistrar;
import com.intellij.spring.dom.SpringCustomNamespaces;
import com.intellij.util.xml.reflect.DomExtensionsRegistrar;

/**
 * @author lzj
 * @date 2018/6/19
 */
public class DubboCustomNamespaces extends SpringCustomNamespaces {
    @Override
    public NamespacePolicies getNamespacePolicies() {
        return (new NamespacePolicies()).add("DubboReference namespace key", "http://code.alibabatech.com/schema/dubbo");
    }

    @Override
    public void registerExtensions(DomExtensionsRegistrar registrar) {
        CustomNamespaceRegistrar.create(registrar, "DubboReference namespace key")
                .add("reference", DubboReference.class)
                .add("application", DubboApplication.class).add("registry", DubboRegistry.class)
                .add("provider", DubboProvider.class).add("consumer", DubboConsumer.class);
    }
}
