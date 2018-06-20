package com.test;

import java.io.File;

/**
 * Created by liuzhouliang on 2018/6/9.
 */
public class Test6 {
    public static void main(String[] args){
        File file=new File("E:\\test\\test6.txt");
        if(!file.exists()){
            file.mkdir();
        }
    }
}
