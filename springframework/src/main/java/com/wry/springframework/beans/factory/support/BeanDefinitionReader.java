package com.wry.springframework.beans.factory.support;

import com.wry.springframework.beans.BeansException;
import com.wry.springframework.core.io.Resource;
import com.wry.springframework.core.io.ResourceLoader;

/**
 * bean 定义信息的阅读器。使用 Resource 和 String 位置参数指定加载方法。
 */
public interface BeanDefinitionReader {

    /**
     * 返回 bean 工厂中注册的 bean 定义。
     * 该工厂通过 BeanDefinitionRegistry 接口公开，封装了与 bean 定义处理相关的方法
     *
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 返回用于资源位置的资源加载器
     *
     * @return
     */
    ResourceLoader getResourceLoader();

    /**
     * 加载Bean定义
     *
     * @param resource
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource resource) throws BeansException;

    /**
     * 加载Bean定义
     *
     * @param resources
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource... resources) throws BeansException;

    /**
     * 加载Bean定义
     *
     * @param location
     * @throws BeansException
     */
    void loadBeanDefinitions(String location) throws BeansException;

}
