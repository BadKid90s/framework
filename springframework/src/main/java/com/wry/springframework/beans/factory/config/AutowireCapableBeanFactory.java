package com.wry.springframework.beans.factory.config;

import com.wry.springframework.beans.factory.BeanFactory;

/**
 * {@link com.wry.springframework.beans.factory.BeanFactory}
 * 接口的扩展将由能够自动装配的 bean 工厂实现，前提是它们希望为现有 bean 实例公开此功能
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
