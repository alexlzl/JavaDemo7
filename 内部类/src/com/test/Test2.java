package com.test;

/**
 * Created by liuzhouliang on 2018/6/14.
 */
public class Test2 {

    public static void main(String[] args) {
        Test2.Inner inner = new Test2.Inner();
    }

    public Test2() {

    }

    protected static class Inner {
        public Inner() {

        }
    }
}
