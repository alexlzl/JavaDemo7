package com.test;

/**
 * Created by liuzhouliang on 2018/6/6.
 */
public class Test7 {
    public static void  main(String[] args){
        A a=new A();
//        a.a="aaaaaaaaa=====";
//        test(a);
        testb(a.a);
        System.out.println(a.a);
        testc(a.sb);
        System.out.println(a.sb.toString());
    }

    public static void test(A a){
        a.a="test========";
    }
    public static void testb(String a){
        a="test========ttt";
    }
    public static void testc(StringBuilder a){
        a.append("add");
    }
}
