package com.itheima.modifer;

import java.text.DateFormat;

public class Demo {
    public static void main(String[] args) {
        // TODO 不同权限修饰符的作用
        Fu f = new Fu();
        // f.privateMethod(); 报错
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
