package com.test;

import java.util.concurrent.TimeUnit;

/**
 * Created by liuzhouliang on 2018/6/28.
 * <p>
 * 可以看到，当主线程结束时，childThread是非守护线程，就会无限的执行。
 * <p>
 * 守护线程有一个应用场景，就是当主线程结束时，结束其余的子线程（守护线程）自动关闭，就免去了还要继续关闭子线程的麻烦。不过博主推荐，如果真有这种场景，还是用中断的方式实现比较合理。
 * <p>
 * 还有补充一点，不是说当子线程是守护线程，主线程结束，子线程就跟着结束，这里的前提条件是：当前jvm应用实例中没有用户线程继续执行，如果有其他用户线程继续执行，那么后台线程不会中
 * <p>
 * (1) thread.setDaemon(true)必须在thread.start()之前设置，否则会跑出一个IllegalThreadStateException异常。你不能把正在运行的常规线程设置为守护线程。
 * (2) 在Daemon线程中产生的新线程也是Daemon的。
 * (3) 不要认为所有的应用都可以分配给Daemon来进行服务，比如读写操作或者计算逻辑。
 * 写java多线程程序时，一般比较喜欢用java自带的多线程框架，比如ExecutorService，但是java的线程池会将守护线程转换为用户线程，所以如果要使用后台线程就不能用java的线程池。
 * 如下，线程池中将daemon线程转换为用户线程的程序片段：
 */
public class DaemonThreadTest {

    public static void main(String[] args) {
        Thread mainThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread childThread = new Thread(new ClildThread());
                childThread.setDaemon(false);
                childThread.start();
                System.out.println("I'm main thread...");
            }
        });
        mainThread.start();
    }
}

class ClildThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("I'm child thread..");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}