package com.test;

/**
 * Created by liuzhouliang on 2018/6/7.
 */
public class Bean {
    public int   age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "age='" + age + '\'' +
                ", name=" + name +
                '}';
    }
}
