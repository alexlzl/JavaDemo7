package com.test;

/**
 * Created by liuzhouliang on 2018/6/13.
 * <p>
 * 成员内部类是最普通的内部类，它的定义为位于另一个类的内部，形如下面的形式
 * <p>
 * 成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。
 */
public class Test {
    private String name = "外部类变量";
    double radius = 0;


    public Test(double radius) {
        this.radius = radius;
    }

//    public static void  main(String[] args){
//        new Draw().drawSahpe();
//    }

    private void test() {
        Draw draw = new Draw();
    }

    /**
     * 当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。如果要访问外部类的同名成员，需要以下面的形式进行访问：
     * <p>
     * 外部类.this.成员变量
     * 外部类.this.成员方法
     * <p>
     * 内部类可以拥有private访问权限、protected访问权限、public访问权限及包访问权限。比如上面的例子，如果成员内部类Inner用private修饰，则只能在外部类的内部访问，如果用public修饰，则任何地方都能访问；如果用protected修饰，则只能在同一个包下或者继承外部类的情况下访问；如果是默认访问权限，则只能在同一个包下访问。这一点和外部类有一点不一样，外部类只能被public和包访问两种权限修饰
     */
    protected class Draw {     //内部类
        private String name = "内部类变量";

        public void drawSahpe() {
            System.out.println(name);
            System.out.println(Test.this.name);
        }
    }
}
