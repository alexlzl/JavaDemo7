package com.test;

/**
 * Created by liuzhouliang on 2018/6/13.
 */
public class Man {

    public Man() {

    }

    public void test(){
    }

    public People getWoman() {
         String name;
//         System.out.println(name);
        class Woman extends People {   //局部内部类
            int age = 0;
        }
        return new Woman();
    }

    /**
     * 局部变量要初始化使用
     */
    {
        String name=null;
        System.out.println(name);
    }
}
