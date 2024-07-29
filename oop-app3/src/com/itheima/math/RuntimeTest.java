package com.itheima.math;

// Runtime的几个常见方法
public class RuntimeTest {
    public static void main(String[] args) {

        // 1.
        Runtime r = Runtime.getRuntime();

        //2.
        // r.exit(0);

        //3.
        System.out.println(r.availableProcessors());// 12

        //4.
        System.out.println(r.totalMemory());// 268435456

        //5.
        System.out.println(r.freeMemory());// 265413464

        //6.
        // r.exec(""); //输入程序的路径
        // Process p = r.exec("QQ");
        // Thread.sleep(5000);// 让程序在这里暂停五秒后继续往下走
        // p.destroy();// 销毁关闭程序
    }
}
