package com.itheima.loop;

public class DoWhileDemo5 {
    public static void main(String[] args) {
        // TODO 掌握DoWhile循环的书写格式，执行流程，特点和应用场景
        // 需求 打印三行Hello World
        int i = 0;
        do {
            System.out.println("Hello World");
            i++;
        }while (i<3);

        //特点：先执行后判断
    }
}
