package com.test;

/**
 * Created by liuzhouliang on 2018/6/16.
 */
public class Test5 {

    public static void main(String[] args) {
        String str2 = "SEUCalvin";//新加的一行代码，其余不变
        String str1 = new String("SEU") + new String("Calvin");
        System.out.println(str1.intern() == str1);//false
        System.out.println(str1 == "SEUCalvin");//false
    }
}
