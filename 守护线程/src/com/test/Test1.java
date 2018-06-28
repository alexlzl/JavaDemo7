package com.test;

/**
 * Created by liuzhouliang on 2018/6/28.
 * 前台线程是保证执行完毕的，后台线程还没有执行完毕就退出了。
 * 实际上：JRE判断程序是否执行结束的标准是所有的前台执线程行完毕了，而不管后台线程的状态，因此，在使用后台县城时候一定要注意这个问题。
 * <p>
 * <p>
 * 定义：守护线程--也称“服务线程”，在没有用户线程可服务时会自动离开。
 * 优先级：守护线程的优先级比较低，用于为系统中的其它对象和线程提供服务。
 * 设置：通过setDaemon(true)来设置线程为“守护线程”；将一个用户线程设置为
 * 守护线程的方式是在 线程对象创建 之前 用线程对象的setDaemon方法。
 * example: 垃圾回收线程就是一个经典的守护线程，当我们的程序中不再有任何运行的
 * Thread,程序就不会再产生垃圾，垃圾回收器也就无事可做，所以当垃圾回收线程是
 * JVM上仅剩的线程时，垃圾回收线程会自动离开。它始终在低级别的状态中运行，用于
 * 实时监控和管理系统中的可回收资源。
 * 生命周期：守护进程（Daemon）是运行在后台的一种特殊进程。它独立于控制终端并且
 * 周期性地执行某种任务或等待处理某些发生的事件。也就是
 * 说守护线程不依赖于终端，但是依赖于系统，与系统“同生共死”。那Java的守护线程是
 * 什么样子的呢。当JVM中所有的线程都是守护线程的时候，JVM就可以退出了；如果还有一个
 * 或以上的非守护线程则JVM不会退出。
 */
public class Test1 {
    public static void main(String[] args) {
        Thread t1 = new MyCommon();
        Thread t2 = new Thread(new MyDaemon());
        t2.setDaemon(true); //设置为守护线程
        t2.start();
        t1.start();
    }
}

class MyCommon extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程1第" + i + "次执行！");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyDaemon implements Runnable {
    public void run() {
        for (long i = 0; i < 9999999L; i++) {
            System.out.println("后台线程第" + i + "次执行！");
            try {
                Thread.sleep(7);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}