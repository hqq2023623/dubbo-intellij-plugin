package com.zj.dubbo.spring;

import com.intellij.spring.model.xml.BeanName;
import com.intellij.spring.model.xml.BeanType;
import com.intellij.spring.model.xml.DomSpringBean;
import com.intellij.util.xml.Stubbed;
import com.intellij.util.xml.StubbedOccurrence;

/**
 * @author lzj
 * @date 2018/6/19
 */
@Stubbed
@StubbedOccurrence
@BeanType("com.alibaba.dubbo.config.ConsumerConfig")
@BeanName(provider = DubboBeanNameProvider.class)
public interface DubboConsumer extends DomSpringBean, DubboElement {
}
