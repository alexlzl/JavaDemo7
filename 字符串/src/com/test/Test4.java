package com.test;

/**
 * Created by liuzhouliang on 2018/6/16.
 */
public class Test4 {
    public static void main(String[] args) {
        String str1 = new String("SEU") + new String("Calvin");
//        String str1 ="SEU"+"Calvin";
        System.out.println(str1.intern() == str1);//true
        System.out.println(str1 == "SEUCalvin");//true

        String s1 = new String("kvill");
        System.out.println(s1.intern()==s1 );//false
    }
}
