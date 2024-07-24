package com.itheima.modife;

import com.itheima.modifer.Fu;

public class Demo2 {
    public static void main(String[] args) {
        Fu f = new Fu();
        // f.privateMethod(); // 报错
        // f.method();// 报错
        // f.protectedMethod();// 报错
        f.publicMethod();

        Zi zi = new Zi();
        // zi.protectedMethod();  // 报错
    }
}
