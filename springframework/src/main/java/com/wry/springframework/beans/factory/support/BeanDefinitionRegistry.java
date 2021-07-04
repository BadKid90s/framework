package com.wry.springframework.beans.factory.support;

import com.wry.springframework.beans.factory.factory.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
