package com.test;

/**
 * Created by liuzhouliang on 2018/6/28.
 * ①线程正常退出，即run()方法执行完毕了
 * <p>
 * ②使用Thread类中的stop()方法强行终止线程。但stop()方法已经过期了，不推荐使用
 * <p>
 * ③使用中断机制
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            MyThread1 thread = new MyThread1();
            thread.start();
            Thread.sleep(20);//modify 2000 to 20
            thread.interrupt();//请求中断MyThread线程
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
