package com.test;

/**
 * Created by liuzhouliang on 2018/6/14.
 * <p>
 * 局部变量：3
 * 内部类变量：2
 * 外部类变量：1
 */
public class Outter {
    private int a = 1;

    public void test(){
        In in=new In();
        in.test();
        System.out.println(in.a);
    }

    class Inner {
        private int a = 2;

        public void print() {
            int a = 3;
            System.out.println("局部变量：" + a);
            System.out.println("内部类变量：" + this.a);
            System.out.println("外部类变量：" + Outter.this.a);
        }
    }

    class  In{
        private String a;
        private void test(){
             class I{

            }

        }
    }
}
