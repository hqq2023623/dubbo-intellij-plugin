package com.zj.dubbo.spring;

import com.intellij.spring.model.xml.BeanName;
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
@BeanType("com.alibaba.dubbo.config.ApplicationConfig")
@BeanName(provider = DubboBeanNameProvider.class)
public interface DubboApplication extends DomSpringBean, DubboElement{

    @Stubbed
    @NotNull
    GenericAttributeValue<String> getName();
}
