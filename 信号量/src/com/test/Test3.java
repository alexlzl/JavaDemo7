package com.test;

import java.util.concurrent.Semaphore;

/**
 * Created by liuzhouliang on 2018/6/26.
 */
public class Test3 {
    public static void main(String[] args) throws  Exception{
        Semaphore semaphore=new Semaphore(1);
        for (int i=0;i<3;i++){
            semaphore.acquire();
            System.out.println("=======");
//            semaphore.release();
        }

    }
}
