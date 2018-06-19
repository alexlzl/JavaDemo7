package com.test;

/**
 * Created by liuzhouliang on 2018/6/15.
 */
public class Test2 {
    static String s3="abcd";
    public static void main(String[] args) {
        String a = "a1";
        String b = "a" + 1;
        String  s="abcd";
        System.out.println(s.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(a == b);//true

        String s1="ab";
        String s2="cd";
        String s4=s1+s2;
        String s5="ab"+"cd";
        String s6="ff";
        String s7="ff";
        System.out.println(s6==s7);//true
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4)+"=============");//false
        System.out.println(s3==s5);//true
        test();
    }

    public static void test(){
        String s="abcd";
        System.out.println((s==s3)+"=========11111111111");
        System.out.println(s.hashCode());
    }
}
