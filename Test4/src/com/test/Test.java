package com.test;

/**
 * Created by liuzhouliang on 2018/6/14.
 */
public class Test {
    static int i = 0;

    public static void main(String[] args) {
        test();
    }

    /**
     * 在新的线程创建时，JVM会为每个线程创建一个专属的栈（stack），其栈是先进后出的数据结构，这种方式的特点，让程序员编程时，必须特别注意递归方法要尽量少使用，另外栈的大小也有一定的限制，如果过多的递归，容易导致stack overflow。
     */
    private static void test() {

        System.out.println(++i + "====test");
        test();
    }
}
