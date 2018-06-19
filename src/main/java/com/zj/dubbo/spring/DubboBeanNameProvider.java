package com.zj.dubbo.spring;

import com.intellij.psi.PsiType;
import com.intellij.spring.model.xml.BeanNameProvider;
import com.intellij.spring.model.xml.DomSpringBean;
import org.jetbrains.annotations.Nullable;

/**
 * @author lzj
 * @date 2018/6/19
 */
public class DubboBeanNameProvider implements BeanNameProvider{
    @Nullable
    @Override
    public String getBeanName(DomSpringBean domSpringBean) {
        String id = domSpringBean.getId().getStringValue();
        if (id != null && id.length() > 0) {
            return id;
        }
        if (domSpringBean instanceof DubboApplication) {
            return ((DubboApplication) domSpringBean).getName().getValue();
        }
        PsiType psiType = domSpringBean.getBeanType();
        return psiType == null ? "" : psiType.getCanonicalText();
    }
}
