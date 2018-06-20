package com.test;

/**
 * Created by liuzhouliang on 2018/6/13.
 */
public class Test {
    public String t="test";

    public static void main(String[] args){
       new Thread(new Runnable() {
           @Override
           public void run() {
               test();
           }
       }).start();
    }

    public static void test(){
         int a=0;
        a++;
        System.out.println(a);

    }

    public class  In{
        public void test(){
            System.out.println(t);
        }
    }

}
