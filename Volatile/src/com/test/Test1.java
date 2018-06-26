package com.test;

/**
 * Created by liuzhouliang on 2018/6/26.
 * Java HotSpot(TM) 64-Bit Server VM
 * mixed mode
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.vm.name")); //获取JVM名字和类型
        System.out.println(System.getProperty("java.vm.info")); //获取JVM的工作模式
    }
}
