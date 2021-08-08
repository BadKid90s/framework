package com.wry.springframework.beans.factory.support;

import com.wry.springframework.beans.BeansException;
import com.wry.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略接口
 */
public interface InstantiationStrategy {

    /**
     * 返回此工厂中具有给定名称的 bean 实例。
     *
     * @param beanDefinition bean 配置信息
     * @param beanName       bean 名称
     * @param ctor           构造器
     * @param args           参数
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
