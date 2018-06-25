package com.test;

import java.util.concurrent.Callable;

/**
 * Created by liuzhouliang on 2018/6/25.
 */
public class MyThread2 implements Callable<Integer> {
    public Integer call() throws Exception {
        System.out.println("当前线程名——" + Thread.currentThread().getName());
        int i = 0;
        for (; i < 5; i++) {
            System.out.println("循环变量i的值：" + i);
        }

        return i;
    }
}
