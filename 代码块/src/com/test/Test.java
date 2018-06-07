package com.test;

/**
 * Created by liuzhouliang on 2018/6/7.
 * <p>
 * 类======静态代码块初始化
 * 类======代码块初始化
 * 方法内容执行
 * 方法======代码块初始化
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("方法内容执行");
        {
            System.out.println("方法======代码块初始化");
        }


    }

    static {
        System.out.println("类======静态代码块初始化");
    }

    {
        System.out.println("类======代码块初始化");
    }
}
