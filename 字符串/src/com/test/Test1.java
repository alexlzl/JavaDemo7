package com.test;

/**
 * Created by liuzhouliang on 2018/6/12.
 */
public class Test1 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String ss1="ab";
        String ss2="cd";
        String s3="abcd";
        String ss4=ss1+ss2;
        System.out.println((s3==ss4)+"========");//false
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);//返回true
        /**
         * String s = new String("abc")实际上是"abc"本身就是常量池中的一个对象，在运行 new String()时，把常量池即pool中的字符串"abc"复制到堆中，并把这个对象的应用交给s，所以创建了两个String对象，一个在pool中，一个在堆中
         */
        String s11 = new String("abc");
        String s22 = new String("abc");
        System.out.println(s11 == s22);//返回false
        System.out.println((s11 == s1)+"============");//false
        String sa = "abcd";
        String sa1 = "ab" + "cd";
        System.out.println(sa.hashCode());//2987074
        System.out.println(sa1.hashCode());//2987074
        System.out.println((sa == sa1) + "===============");//true
        test();
    }

    /**
     * 可知在堆中创建了两个对象，但是在文字池中有一个对象，所以共创建了三个对象
     */
    public static void test() {
        // TODO Auto-generated method stub
        String s1 = new String("abc");
        String s2 = new String("abc");
        if (s1 == s2) { //不会执行的语句}
            System.out.println("在堆中创建了一个对象");

        } else {
            System.out.println("在堆中创建了两个对象");
        }
    }
}
