package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by liuzhouliang on 2018/6/9.
 */
public class Test {
    public static void main(String[] args) {
        // TODO自动生成的方法存根
        byte[] buffer = new byte[512];   //一次取出的字节数大小,缓冲区大小
        int numberRead = 0;
        FileInputStream input = null;
        FileOutputStream out = null;
        try {
            input = new FileInputStream("E:\\test.jpg");
            out = new FileOutputStream("E:\\test_copy.jpg"); //如果文件不存在会自动创建
           System.out.println(input.available());
            while ((numberRead = input.read(buffer)) != -1) {  //numberRead的目的在于防止最后一次读取的字节小于buffer长度，
                System.out.println(numberRead+"=========");
                out.write(buffer, 0, numberRead);       //否则会自动被填充0
                System.out.println("write=="+buffer.length);
            }
        } catch (final IOException e) {
            // TODO自动生成的 catch 块
            e.printStackTrace();
        } finally {
            try {
                input.close();
                out.close();
            } catch (IOException e) {
                // TODO自动生成的 catch 块
                e.printStackTrace();
            }

        }
    }
}
