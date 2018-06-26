package com.test;

/**
 * Created by liuzhouliang on 2018/6/26.
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testFair();
    }
}
