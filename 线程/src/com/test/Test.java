package com.test;

/**
 * Created by liuzhouliang on 2018/6/21.
 */
public class Test {

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getThreadGroup().getName());//main
        System.out.println(Thread.currentThread().getName());//main
        ThreadGroup threadGroup=new ThreadGroup("testGroup");
        new Thread(threadGroup,new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());//testThread
                System.out.println(Thread.currentThread().getThreadGroup().getName());//testGroup
            }
        },"testThread").start();
    }
}
