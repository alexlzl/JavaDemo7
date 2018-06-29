package com.test;

/**
 * Created by liuzhouliang on 2018/6/29.
 */
public class Interrupt {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Worker());
        t.start();

        Thread.sleep(200);
        t.interrupt();

        System.out.println("主线程停止==================.");
    }

    public static class Worker implements Runnable {
        public void run() {
            System.out.println("子线程开始========================.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                /**
                 *   if any thread has interrupted the current thread. The
                 *   <i>interrupted status</i> of the current thread is
                 *   cleared when this exception is thrown.
                 *
                 *   注意到后面这句“当抛出这个异常的时候，中断状态已被清除”。
                 *   所以isInterrupted()方法应该返回false。
                 *   可是有的时候，我们需要isInterrupted这个方法返回true，怎么办呢？
                 *   这里就要先说说interrupt, interrupted和isInterrupted的区别了：
                 *
                 *   interrupt方法是用于中断线程的，调用该方法的线程的状态将被置为"中断"状态。
                 *   注意：线程中断仅仅是设置线程的中断状态位，不会停止线程。
                 *   需要用户自己去监视线程的状态为并做处理。
                 *   支持线程中断的方法（也就是线程中断后会抛出InterruptedException的方法，比如这里的sleep，以及Object.wait等方法）
                 *   就是在监视线程的中断状态，一旦线程的中断状态被置为“中断状态”，就会抛出中断异常
                 */
                System.out.println("子线程中断状态: " +
                        Thread.currentThread().interrupted());
                System.out.println("子线程中断状态: " +
                        Thread.currentThread().isInterrupted());
            }

            System.out.println("子线程停止========================.");
        }
    }
}
