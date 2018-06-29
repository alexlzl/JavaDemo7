package com.test;

/**
 * Created by liuzhouliang on 2018/6/26.
 */
public class Test extends Thread {

    volatile boolean flag = false;
    //    boolean flag = false;
    int i = 0;

    public void run() {
        while (!flag) {
//            i++;
//            System.out.println("run===" + i);
        }
        System.out.println("当前线程===" + Thread.currentThread().getName());//当前线程===child thread
        System.out.println("flag===" + flag);
    }

    public static void main(String[] args) throws Exception {
        Test vt = new Test();
        vt.setName("child thread");
        vt.start();
        Thread.sleep(500);

        vt.flag = true;
        System.out.println("当前线程===" + Thread.currentThread().getName());//main
        System.out.println("更改flag================true");
    }
}
