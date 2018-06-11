package com.test;

import java.io.UnsupportedEncodingException;

/**
 * Created by liuzhouliang on 2018/6/11.
 */
public class Test {

    /**
     * 字节长度为：11
     * 字符长度为：7
     * 系统默认编码方式：UTF-8
     *
     * @param args
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "你好hello";
        int byte_len = str.getBytes().length;
        System.out.println("字节长度为：" + byte_len);//11
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
        int byte_len1 = str.getBytes("gbk").length;
        System.out.println("字节长度为：" + byte_len1);//9
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
        int byte_len2 = str.getBytes("utf-16").length;
        System.out.println("字节长度为：" + byte_len2);//6
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
        int len = str.length();


        System.out.println("字符长度为：" + len);

    }
}
