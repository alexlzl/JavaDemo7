package com.test;

import static java.lang.Math.*;

/**
 * Created by liuzhouliang on 2018/6/6.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(1 / 2);//0
        System.out.println(32 %32);//1
        System.out.println(1 % 2);//1
        System.out.println(1.0 / 2.0);//0.5
        System.out.println(1.0 % 2.0);//1.0
        System.out.println(1 / 2.0);//0.5
        System.out.println(2.0 / 1);//2.0
        System.out.println(2.0 % 1);//0.0
//        System.out.println(1/0);//整型被0除产生异常
        System.out.println(1.0 / 0);//无穷大
        //对于移位运算符，右侧的参数都需要进行32的模运算（n%32），如果左侧参数是long类型则进行64的模运算 (64)
        System.out.println(1<<35);
        System.out.println(1<<30);//1073741824
        System.out.println(1<<3);//8
        System.out.println(sqrt(4));//平方根运算
        System.out.println(Math.pow(2,2));//幂运算
        int i=123456789;
        float ii=i;//1.23456792E8
        System.out.println(ii);
    }
}
