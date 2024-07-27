package com.itheima.inner_class1.inner_class1;

public class Test {
    public static void main(String[] args) {
        // TODO 成员内部类及其特点
        Outer.Inner in = new Outer().new Inner();
        in.test();
    }
}
