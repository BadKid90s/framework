package com.wry.springframework.beans.factory.config;

/**
 * Bean 的引用
 * @author wry
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
