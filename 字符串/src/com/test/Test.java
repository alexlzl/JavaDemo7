package com.test;

import java.util.Arrays;

/**
 * Created by liuzhouliang on 2018/6/7.
 */
public class Test {
    public static void main(String[] args){
        String str="abcdef";
        String name="刘";
        String name1="严";
        char c1='严';
        char c2='a';

        char c3=',';
        System.out.println(str.codePointAt(1));
        System.out.println(str.indexOf(98));
        System.out.println(new StringBuilder().appendCodePoint(98));
        System.out.println(name.codePointAt(0));//21016
        System.out.println(name1.codePointAt(0));//20005
        System.out.println(Arrays.toString(charToByte2(c1)));
        System.out.println(Arrays.toString(charToByte2(c2)));
        getByteString(c1);//100111000100101============ 2字节
        getByteString(c2);//1100001  ================1字节
        getByteString(c3);//101100   ===========1字节
    }

    public static byte[] charToByte2(char c) {
        byte[] arr = new byte[2];
        arr[0] = (byte) (c >> 8);
        arr[1] = (byte) (c & 0xff);
        return arr;
    }


    public static void  getByteString(char c){
        int a=(int)c;
//        Integer integer=new Integer(a);
        System.out.println(Integer.toBinaryString(a));

    }

}
