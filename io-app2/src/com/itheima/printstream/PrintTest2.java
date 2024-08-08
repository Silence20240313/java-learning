package com.itheima.printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

// TODO 输出语句的重定向
public class PrintTest2 {
    public static void main(String[] args) {
        System.out.println("十万伏特");
        System.out.println("想到我们");


        try(
                PrintStream ps = new PrintStream("io-app2\\src\\itheima09.txt");
                ) {
            // 把系统默认的打印流对象改成自己设置的打印流
            System.setOut(ps);

            System.out.println("放逐");
            System.out.println("眼泪落下之前");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
