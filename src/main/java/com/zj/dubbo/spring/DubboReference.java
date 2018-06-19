package com.zj.dubbo.spring;

import com.intellij.spring.model.xml.BeanType;
import com.intellij.spring.model.xml.DomSpringBean;
import com.intellij.util.xml.GenericAttributeValue;
import com.intellij.util.xml.Stubbed;
import com.intellij.util.xml.StubbedOccurrence;
import org.jetbrains.annotations.NotNull;

/**
 * @author lzj
 * @date 2018/6/19
 */
@Stubbed
@StubbedOccurrence
@BeanType(provider = DubboReferenceBeanTypeProvider.class)
public interface DubboReference extends DomSpringBean, DubboElement {

    @Stubbed
    @NotNull
    GenericAttributeValue<String> getInterface();
}
