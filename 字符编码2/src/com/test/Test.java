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
        System.out.println("字节长度为：" + byte_len);//11===因为在utf-8编码中，该中文字符占了3个字节，英文字符占1个字节。
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
        int byte_len1 = str.getBytes("gbk").length;
        System.out.println("字节长度为：" + byte_len1);//9===因为在GBK编码中，中文占2个字节，而英文字符占1个字节。
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
        int byte_len2 = str.getBytes("utf-16").length;
        System.out.println("字节长度为：" + byte_len2);//16=====因为在utf-16编码中，该中文字符占了3个字节，英文字符占2个字节。
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
        int byte_len3 = str.getBytes("utf-32").length;
        System.out.println("字节长度为：" + byte_len3);//28=====因为在utf-32编码中，所有的字符均占4个字节。
        System.out.println("系统默认编码方式：" + System.getProperty("file.encoding"));
        int len = str.length();


        System.out.println("字符长度为：" + len);

        String  string="你";
        String str2="你好";
        System.out.println(string.getBytes("utf-16").length);//4
        System.out.println(str2.getBytes("utf-16").length);//6

    }
}
