package com.wry.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 从底层资源的实际类型（例如文件或类路径资源）中抽象出来的资源描述符的接口
 */
public interface Resource {
    /**
     * 为底层资源的内容返回一个 {@link InputStream}。
     *
     * @return
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;
}
