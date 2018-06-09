package com.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by liuzhouliang on 2018/6/9.
 * <p>
 * PrintStream 说这个名字可能初学者不熟悉，如果说System.out.print()你肯定熟悉，System.out这个对象就是PrintStream，这个我们不做过多示例
 * 三、字符流（顾名思义，就是操作字符文件的流）
 * 1.java 使用Unicode存储字符串，在写入字符流时我们都可以指定写入的字符串的编码。前面介绍了不用抛异常的处理字节型数据的流ByteArrayOutputStream，与之对应的操作字符类的类就是CharArrayReader,CharArrayWriter类，这里也会用到缓冲区，不过是字符缓冲区，一般讲字符串放入到操作字符的io流一般方法是
 * CharArrayReaderreader=mew CharArrayReader(str.toCharArray()); 一旦会去到CharArrayReader实例就可以使用CharArrayReader访问字符串的各个元素以执行进一步读取操作。不做例子
 * 2.我们用FileReader ，PrintWriter来做示范
 */
public class Test5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO自动生成的方法存根
        char[] buffer = new char[512];   //一次取出的字节数大小,缓冲区大小
        int numberRead = 0;
        FileReader reader = null;        //读取字符文件的流
        PrintWriter writer = null;    //写字符到控制台的流

        try {
            reader = new FileReader("E:\\test\\test5.txt");
            writer = new PrintWriter(System.out);  //PrintWriter可以输出字符到文件，也可以输出到控制台
            while ((numberRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, numberRead);
            }
        } catch (IOException e) {
            // TODO自动生成的 catch 块
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                // TODO自动生成的 catch 块
                e.printStackTrace();
            }
            writer.close();       //这个不用抛异常
        }

    }
}
