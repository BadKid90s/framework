package com.wry.springframework.beans.factory.support;

/**
 * 用于保存单个 bean 属性的信息和值的对象
 *
 * @author wry
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
