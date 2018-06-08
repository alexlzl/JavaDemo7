package com.test;

/**
 * Created by liuzhouliang on 2018/6/8.
 */
public class Test1 {
    private static Test1 ourInstance = new Test1();

    public static Test1 getInstance() {
        return ourInstance;
    }

    private Test1() {
    }
}
