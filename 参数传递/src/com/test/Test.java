package com.test;

/**
 * Created by liuzhouliang on 2018/6/7.
 */
public class Test {

    public static void main(String[] args) {
        String str = new String("aaaaaaaaa");
        changeString(str);//引用副本指向了新的对象,不会改变之前引用指向的对象
        System.out.println(str);//aaaaaaaaa
        changeString1(str);
        System.out.println(str);//aaaaaaaaa
        Bean bean=new Bean();
        bean.name="alex";
        bean.age=100;
        changeBean(bean);//改变了name的值
        System.out.println(bean.name);//alex--lzl
        changeBean1(bean);//不会改变name的值
        System.out.println(bean.name);//alex--lzl
        changeInt(bean.age);//不会改变age的值
        System.out.println(bean.age);//100
    }

    public static void change(Bean bean, String str, StringBuffer stringBuffer, int a) {

    }

    public static void changeString(String str) {
        str = "newstr";
    }
    public static void changeString1(String str) {
    String  s=  str + "newstr";
    }

    public static void changeBean(Bean bean){
        bean.name="alex--lzl";
    }

    public static void changeBean1(Bean bean){
        Bean bean1=new Bean();
        bean1.name="alex--lzl==========";
        bean=bean1;
    }

    public static  void changeInt(int age){
        age=101;
    }
}
