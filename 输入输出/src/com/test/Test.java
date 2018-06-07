package com.test;

import java.util.Scanner;

/**
 * Created by liuzhouliang on 2018/6/7.
 * <p>
 * Scanner是SDK1.5新增的一个类,可使用该类创建一个对象。
 * Scanner reader=new Scanner(System.in);
 * 然后reader对象调用下列方法（函数）,读取用户在命令行输入的各种数据类型
 * next.Byte(),nextDouble(),nextFloat,nextInt(),nextLine(),nextLong(),nextShot()
 * 上述方法执行时都会造成堵塞,等待用户在命令行输入数据回车确认.例如,拥护在键盘输入12.34，hasNextFloat()的值是true,而hasNextInt()的值是false。NextLine()等待用户输入一个文本行并且回车，该方法得到一个String类型的数据。
 * Scanner的构造器支持多种方式，可以从字符串（Readable）、输入流、文件等等来直接构建Scanner对象，有了Scanner了，就可以逐段（根据正则分隔式）来扫描整个文本，并对扫描后的结果做想要的处理。
 */
public class Test {
    public static void main(String args[]) {
        System.out.println("请输入若干个数,每输入一个数用回车确认");
        System.out.println("最后输入一个非数字结束输入操作");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (reader.hasNextDouble()) {
            double x = reader.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.printf("%d个数的和为%f\n", m, sum);
        System.out.printf("%d个数的平均值是%f\n", m, sum / m);
    }
}
