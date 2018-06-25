package com.test;

/**
 * Created by liuzhouliang on 2018/6/23.
 * 启动线程使用start()方法，而不是run()方法。永远不要调用线程对象的run()方法。
 * 调用start0方法来启动线程，系统会把该run()方法当成线程执行体来处理；
 * 但如果直按调用线程对象的run()方法，则run()方法立即就会被执行，而且在run()方法返回之前其他线程无法并发执行。
 * 也就是说，系统把线程对象当成一个普通对象，而run()方法也是一个普通方法，而不是线程执行体。
 * 需要指出的是，调用了线程的run()方法之后，该线程已经不再处于新建状态，不要再次调用线程对象的start()方法。
 * 只能对处于新建状态的线程调用start()方法，否则将引发IllegaIThreadStateExccption异常。
 */
public class Test1 extends Thread {
    public static void main(String[] args) {
//            new Test1().run();
        Test1 test1 = new Test1();
        test1.start();
        /**
         * Exception in thread "main" java.lang.IllegalThreadStateException
         at java.lang.Thread.start(Thread.java:705)
         at com.test.Test1.main(Test1.java:17)
         */
//        test1.start();
        System.out.println(Thread.currentThread().getName() + "=====main=============");
    }

    @Override
    public void run() {
        super.run();
        try {
            sleep(1000);
            System.out.println(Thread.currentThread().getName() + "====run==========");
            run();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
