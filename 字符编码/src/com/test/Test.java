package com.test;

import java.io.UnsupportedEncodingException;

/**
 * Created by liuzhouliang on 2018/6/11.
 */
public class Test {
    public static void main(String[] args){
        char a='a';
        char b='严';

        System.out.println(Integer.toBinaryString((int)a));//============1100001
        System.out.println(Integer.toBinaryString((int)b));//==========1001 1100 0100 101
        String c="严";
        String c1="刘";
        System.out.println(c.getBytes().length);//3
        System.out.println(c1.getBytes().length);//3
        try {
            System.out.println(c.getBytes("utf-8").length);//3
            System.out.println(c.getBytes("utf-16").length);//4
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
