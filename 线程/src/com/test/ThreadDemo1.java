package com.test;

/**
 * Created by liuzhouliang on 2018/6/22.
 * <p>
 * active count is 6
 * Reference Handler
 * Finalizer
 * Signal Dispatcher
 * Attach Listener
 * main
 * Monitor Ctrl-Break
 */
public class ThreadDemo1 {

    public static void main(String[] args) {
        ThreadGroup g = Thread.currentThread().getThreadGroup();
        while (g != null) {
            ThreadGroup temp = g.getParent();
            if (temp == null) {
                break;
            }
            g = temp;
        }

        //现在g就是跟线程组
        System.out.println("active count is " + g.activeCount());

        Thread[] all = new Thread[g.activeCount()];
        g.enumerate(all);
        for (Thread t : all) {
            System.out.println(t.getName());
        }
    }
}
