package com.wry.springframework.beans.factory.support;

import java.util.ArrayList;
import java.util.List;

/**
 * 包含一个或多个PropertyValue对象的持有者，通常包括针对特定目标 bean 的一次更新。
 *
 * @author wry
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }

}
