package com.test;

import java.io.UnsupportedEncodingException;

/**
 * Created by liuzhouliang on 2018/6/11.
 */
public class Test {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="严";
        System.out.println(s.getBytes("utf-16").length);//4
    }
}
