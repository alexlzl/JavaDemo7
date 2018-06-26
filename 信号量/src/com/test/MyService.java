package com.test;

import java.util.concurrent.Semaphore;

/**
 * Created by liuzhouliang on 2018/6/26.
 */
public class MyService {
    private Semaphore semaphore = new Semaphore(1);

    @SuppressWarnings("unused")
    public void testFair(){
        if(semaphore.tryAcquire()){
            System.out.println( Thread.currentThread().getName() + "首先进入");
            //做一些耗时操作
            for(int i = 0; i < Integer.MAX_VALUE ; i ++){
                String newString = new String();
            }

            semaphore.release();
        }else{
            System.out.println(Thread.currentThread().getName() + "没有得到许可");
        }
    }
}
