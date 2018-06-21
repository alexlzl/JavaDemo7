package com.test;

/**
 * Created by liuzhouliang on 2018/6/20.
 */
public class Test7 {
    public static void main(String[] args){
        StringBuffer s;
        s = new StringBuffer("Java");
        StringBuffer s1 = s;
        s1.append(" World");
        System.out.println("s1=" + s1.toString());//打印结果为：s1=Java World
        System.out.println("s=" + s.toString());//打印结果为：s=Java World
    }
}
