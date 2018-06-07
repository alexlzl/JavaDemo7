package com.test;

/**
 * Created by liuzhouliang on 2018/6/7.
 */
public class Test {

    public static void main(String[] args) {
        //跳出嵌套循环标签=================
        out:
        for (int i = 0; i < 10; i++) {
            for (int n = 0; n < 10; n++) {
                System.out.println(n);
                if (n == 2)
                    break out;
            }
        }

        System.out.println("over====");
        /**
         * 跳出整个循环
         */
        for (int i=0;i<10;i++){
            System.out.println(i+"====");
            if(i==2){
                break;
            }
        }
        /**
         * 跳出某一次的循环
         */
        for (int i=0;i<5;i++){

            if(i==2){
                continue;
            }
            System.out.println(i+"tt====");
        }
    }
}
