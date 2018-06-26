package com.test;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by liuzhouliang on 2018/6/26.
 * <p>
 * 有参方法tryAcquire（long timeout, TimeUnit unit）的作用是在指定的时间内尝试地获取1个许可，如果获取不到就返回false。
 */
public class Test2 {
    private static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args){
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    testFair();
                }
            }).start();
        }

    }

    @SuppressWarnings("unused")
    public static void testFair() {
        try {
            if (semaphore.tryAcquire(3, TimeUnit.SECONDS)) {
                System.out.println(Thread.currentThread().getName() + "进入");
                //做一些耗时操作
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                }
                semaphore.release();
            } else {
                System.out.println(Thread.currentThread().getName() + "没有得到许可");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
