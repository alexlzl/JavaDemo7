package com.test;

/**
 * Created by liuzhouliang on 2018/6/29.
 */
public class Test2  {
    public static void main(String[] args){
        Thread thread=new Thread(new TestRunnable());

        thread.start();
//        System.out.println("中断状态==="+thread.isInterrupted());//false
//        System.out.println("中断状态==="+thread.interrupted());//false
        thread.interrupt();
        System.out.println("中断状态==="+thread.interrupted());//false
//        System.out.println("中断状态==="+thread.isInterrupted());//true

//        System.out.println("中断状态==="+thread.isInterrupted());//false
    }

    public static class TestRunnable implements Runnable {

        @Override
        public void run() {
//            try {
//                Thread.sleep(50000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
