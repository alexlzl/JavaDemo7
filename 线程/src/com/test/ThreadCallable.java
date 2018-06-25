package com.test;

import java.util.concurrent.FutureTask;

/**
 * Created by liuzhouliang on 2018/6/25.
 * 当前线程名——线程名：有返回值的线程2
 * 循环变量i的值：0
 * 循环变量i的值：1
 * 循环变量i的值：2
 * 循环变量i的值：3
 * 循环变量i的值：4
 * 子线程的返回值：5
 */
public class ThreadCallable {
    public static void main(String[] args) {

        MyThread2 myThread2 = new MyThread2();

        FutureTask<Integer> futureTask = new FutureTask<>(myThread2);
        new Thread(futureTask, "线程名：有返回值的线程2").start();

        try {
            System.out.println("子线程的返回值：" + futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
