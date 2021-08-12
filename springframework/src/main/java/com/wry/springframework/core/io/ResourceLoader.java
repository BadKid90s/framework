package com.wry.springframework.core.io;

/**
 * 资源加载器
 */
public interface ResourceLoader {

    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    /**
     * 从指定的文件路径获取资源
     *
     * @param location classpath下的文件路径
     * @return
     */
    Resource getResource(String location);

}
