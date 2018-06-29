package com.test;

/**
 * Created by liuzhouliang on 2018/6/29.
 * <p>
 * Worker started.
 * Main thread stopped.
 * Worker IsInterrupted: true
 * Worker IsInterrupted: true
 * Static Call: true
 * ---------After Interrupt Status Cleared----------
 * Static Call: false
 * Worker IsInterrupted: false
 * Worker IsInterrupted: false
 * Worker stopped.
 */
public class Interrupt1 {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Worker());
        t.start();

        Thread.sleep(200);
        t.interrupt();
        System.out.println("Static Call====: " + Thread.interrupted());//false
        System.out.println("Main thread stopped.");
    }

    public static class Worker implements Runnable {
        public void run() {
            System.out.println("Worker started.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread curr = Thread.currentThread();
                //再次调用interrupt方法中断自己，将中断状态设置为“中断”
                curr.interrupt();
                System.out.println("Worker IsInterrupted: " + curr.isInterrupted());//true
                System.out.println("Worker IsInterrupted: " + curr.isInterrupted());//true
                System.out.println("Static Call: " + Thread.interrupted());//clear status==true
                System.out.println("---------After Interrupt Status Cleared----------");
                System.out.println("Static Call: " + Thread.interrupted());//false
                System.out.println("Worker IsInterrupted: " + curr.isInterrupted());//false
                System.out.println("Worker IsInterrupted: " + curr.isInterrupted());//false
            }

            System.out.println("Worker stopped.");
        }
    }
}
