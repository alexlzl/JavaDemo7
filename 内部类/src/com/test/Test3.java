package com.test;

/**
 * Created by liuzhouliang on 2018/6/14.
 */
public class Test3 {

    public static void main(String[] args) {
    }

    public void test(final int b) {
        final int a = 10;
        new Thread() {
            public void run() {
                System.out.println(a);
                System.out.println(b);
            }

        }.start();
    }
}
