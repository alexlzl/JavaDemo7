package com.test;

/**
 * Created by liuzhouliang on 2018/6/7.
 */
public class Test {
    public static void main(String[] args){
        String str="abcdef";
        String name="刘";
        System.out.println(str.codePointAt(1));
        System.out.println(str.indexOf(98));
        System.out.println(new StringBuilder().appendCodePoint(98));
        System.out.println(name.codePointAt(0));//21016
    }
}
