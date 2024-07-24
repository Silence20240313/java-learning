package com.itheima.exten_override;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // TODO 方法重写及常见应用场景
       B b = new B();
       b.print1();
       b.print2(1,2);

        System.out.println("--------------");
        Student s = new Student("波妞",19);
        // System.out.println(s.toString());// 地址
        System.out.println(s); // Student{name=波妞,age=19}

        ArrayList list = new ArrayList();
        list.add("java");
        System.out.println(list);// [java]

    }
}
