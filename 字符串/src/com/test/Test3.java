package com.test;

/**
 * Created by liuzhouliang on 2018/6/16.
 * <p>
 * true
 * false
 * kvill kvill
 * true
 */
public class Test3 {

    public static void main(String[] args) {
        String str1 = new String("ab");
        String str2 = new String("cd");
        String str3 = str1 + str2;
        String str = str3.intern();
        System.out.println(str == str3);//true

        String s1 = new String("kvill");
        String s2 = s1.intern();
        System.out.println(s1 == s1.intern());//false
        System.out.println(s1 + " " + s2);
        System.out.println(s2 == s1.intern());//true
    }
}
