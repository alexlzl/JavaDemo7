package com.test;

/**
 * Created by liuzhouliang on 2018/6/14.
 */
public class Test4 {
    public static void main(String[] args)  {
        Outter outter = new Outter();
        outter.new Inner().print();
    }

}
