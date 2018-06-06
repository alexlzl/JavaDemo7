package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhouliang on 2018/5/25.
 */
public class Test {
    public static void main(String[] args) {
        /*
        test
         */
        int a=0x11;
        long l=100;
        int c=0b1001;//java7以后加上0b表示二进制
        int d=100_00;
        List<String> list = new ArrayList<>();
        list.add("test");
        if(list!=null&&list.size()>0||list.get(0).equals("test")){
            System.out.println("=============");
        }
         System.out.println(1/2);//0
        System.out.println(1%2);//1
        System.out.println(2/2);//1
        System.out.println(0&0);
        System.out.println(0|1);
        System.out.println(0^0);
        long aa=123;
        int bb=-1;
        System.out.println(aa&bb);
        long aa1=123;
        int bb1=1;
        System.out.println(aa1&bb1);
        int a1=1010;

        System.out.println(0110>0100);
        System.out.println(1110+1011);
        int e=1000_0010;

        double dd=10.1D;
        float ff=1001.11f;

        System.out.println(2.3-1.7);
        System.out.println(0.6);
    }
}
