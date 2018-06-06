package com.test;

/**
 * Created by liuzhouliang on 2018/6/2.
 */
public class FloatDoubleTest3 {

    public static void main(String[] args) {
        double d = 8;
        long l = Double.doubleToLongBits(d);
        //100000000100000000000000000000000000000000000000000000000000000
        System.out.println(Long.toBinaryString(l));
        float f = 8;
        int i = Float.floatToIntBits(f);
        //1000001000000000000000000000000
        System.out.println(Integer.toBinaryString(i));
    }
}
