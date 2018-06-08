package com.test;

import java.util.Arrays;

/**
 * Created by liuzhouliang on 2018/6/8.
 */
public class Test2 {
    public static void main(String[] args) {
        int[][] aa = new int[2][2];
        aa[0] = new int[]{1, 2};
        aa[1] = new int[2];
        aa[1] = new int[]{3, 5};
        int[][] bb={{1,2},{3,5},{6,7}};
        System.out.println(Arrays.deepToString(aa));
        System.out.println(Arrays.deepToString(bb));
    }
}
