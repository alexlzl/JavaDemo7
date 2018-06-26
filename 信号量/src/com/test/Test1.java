package com.test;

import java.util.concurrent.Semaphore;

/**
 * Created by liuzhouliang on 2018/6/26.
 * void release()  释放一个许可，别忘了在finally中使用，
 * 注意：多次调用该方法，会使信号量的许可数增加，达到动态扩展的效果，
 * 如：初始permits 为1， 调用了两次release，最大许可会改变为2
 */
public class Test1 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        System.out.println(semaphore.availablePermits());
        semaphore.release(5);
        System.out.println(semaphore.availablePermits());
        for (; ; ) {
            System.out.println(1);
        }
    }
}
