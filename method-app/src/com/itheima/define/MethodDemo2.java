package com.itheima.define;

import java.sql.SQLOutput;

public class MethodDemo2 {
    public static void main(String[] args) {
        //  TODO 掌握按照方法解决的实际业务需求不同，设计出合理的方法形式来解决问题
        // 需求：很多人都要打印多行Hello World
        printHelloWorld(10);
    }
    // 有参数 无返回值的方法
    public static void  printHelloWorld(int n){
        for (int i = 1; i <= n ; i++) {
            System.out.println("Hello World");
        }
    }
}
