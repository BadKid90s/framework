package com.wry.springframework.beans.factory;

import com.wry.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
