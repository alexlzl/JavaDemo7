package com.test;

/**
 * Created by liuzhouliang on 2018/6/6.
 */
public class Test6 {
    public final String string="aab";

    public static String 变量名="100\n100\t100\'100\"";
    public static void main(String[] args){
        System.out.println(变量名);
        System.out.println(1/2);
        System.out.println(1.0/2.0);
        System.out.println(1/2.0);
//        System.out.println(1/0);//整型被0除产生异常
        System.out.println(1.0/0);
    }

    public String  变量2="aaa";

    public void test1(){
        System.out.println(变量2);
    }
}
