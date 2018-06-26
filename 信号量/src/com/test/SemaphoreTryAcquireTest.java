package com.test;

/**
 * Created by liuzhouliang on 2018/6/26.
 * <p>
 * A首先进入
 * B没有得到许可
 */
public class SemaphoreTryAcquireTest {
    public static void main(String[] args) {
        MyService service = new MyService();

        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");

        a.start();
        b.start();
    }
}
