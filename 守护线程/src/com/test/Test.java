package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by liuzhouliang on 2018/6/28.
 * <p>
 * (1) thread.setDaemon(true)必须在thread.start()之前设置，否则会跑出一个IllegalThreadStateException异常。你不能把正在运行的常规线程设置为守护线程。
 * (2) 在Daemon线程中产生的新线程也是Daemon的。
 * (3) 不要认为所有的应用都可以分配给Daemon来进行服务，比如读写操作或者计算逻辑。
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runnable tr = new TestRunnable();
        Thread thread = new Thread(tr);
        thread.setDaemon(true); //设置守护线程
        thread.start(); //开始执行分进程
    }
}

/**
 * 把输入输出逻辑包装进守护线程多么的可怕，字符串并没有写入指定文件。
 * 原因也很简单，直到主线程完成，守护线程仍处于1秒的阻塞状态。
 * 这个时候主线程很快就运行完了，虚拟机退出，Daemon停止服务，输出操作自然失败了。
 */
class TestRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);//守护线程阻塞1秒后运行
            File f = new File("E:\\daemon.txt");
            FileOutputStream os = new FileOutputStream(f, true);
            os.write("daemon".getBytes());
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}
