package com.test;

/**
 * Created by liuzhouliang on 2018/6/22.
 * <p>
 * thread main group name is main max priority is 10 thread count is 2
 * main's parent is system
 * --------------------------
 * thread appThread group name is main max priority is 10 thread count is 3
 * main's parent is system
 * --------------------------
 * do loop 0
 * do loop 1
 * do loop 2
 * do loop 3
 * do loop 4
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        printGroupInfo(Thread.currentThread());

        Thread appThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("do loop " + i);
                }
            }
        });
        appThread.setName("appThread");
        appThread.start();
        printGroupInfo(appThread);
    }

    static void printGroupInfo(Thread t) {
        ThreadGroup group = t.getThreadGroup();
        System.out.println("thread=== " + t.getName() + " ==group name is =="
                + group.getName() + " ==max priority is=== " + group.getMaxPriority()
                + " ===thread count is=== " + group.activeCount());//thread=== main group name is ==main max priority is=== 10 thread count is=== 2

        ThreadGroup parent = group;
        do {
            ThreadGroup current = parent;
            parent = parent.getParent();
            if (parent == null) {
                break;
            }

            System.out.println(current.getName() + "===s parent is=== " + parent.getName());//main===s parent is=== system
        } while (true);
        System.out.println("--------------------------");
    }
}
