package com.test;

import java.util.Arrays;

/**
 * Created by liuzhouliang on 2018/6/8.
 */
public class Test {
    public static void main(String[] args){
        int n=1;
        int[] a=new int[n];
        n=100;
        a[0]=100;
        System.out.println(a.length);
        System.out.println(a.toString());
        System.out.println(Arrays.toString(a));

        int[] aa={1,23,3};
        int[] bb=new int[]{};
        int[] cc={};

        System.out.println(Arrays.toString(bb));

        System.out.println(aa.getClass().getName());

        String[] aaa={"sa","ab"};
        System.out.println(aaa.getClass().getName());

        Test[] t={new Test()};
        System.out.println(t.getClass().getName());
    }
}
