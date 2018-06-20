package com.test;

/**
 * Created by liuzhouliang on 2018/6/19.
 * <p>
 * String s = newString("1")，生成了常量池中的“1” 和堆空间中的字符串对象。
 * <p>
 * s.intern()，这一行的作用是s对象去常量池中寻找后发现"1"已经存在于常量池中了。
 * <p>
 * String s2 = "1"，这行代码是生成一个s2的引用指向常量池中的“1”对象。
 * <p>
 * 结果就是 s 和 s2 的引用地址明显不同。因此返回了false。
 * <p>
 * <p>
 * <p>
 * String s3 = new String("1") + newString("1")，这行代码在字符串常量池中生成“1” ，并在堆空间中生成s3引用指向的对象（内容为"11"）。注意此时常量池中是没有 “11”对象的。
 * <p>
 * s3.intern()，这一行代码，是将 s3中的“11”字符串放入 String 常量池中，此时常量池中不存在“11”字符串，JDK1.6的做法是直接在常量池中生成一个 "11" 的对象。
 * <p>
 * 但是在JDK1.7中，常量池中不需要再存储一份对象了，可以直接存储堆中的引用。这份引用直接指向 s3 引用的对象，也就是说s3.intern() ==s3会返回true。
 * <p>
 * String s4 = "11"， 这一行代码会直接去常量池中创建，但是发现已经有这个对象了，此时也就是指向 s3 引用对象的一个引用。因此s3 == s4返回了true。
 */
public class Test6 {

    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);//false

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);//true
    }
}
