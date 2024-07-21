package com.itheima.pkg;
import com.itheima.pkg.itcast.Demo1;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1.
        Demo d = new Demo();
        d.print();

        // 2.
        Demo1 d1 = new Demo1();
        d1.print();

        // 3.
        Scanner sc = new Scanner(System.in );
        String s = "黑马";
        Random r = new Random();

        // 4.
        Demo2 d2 = new Demo2();
        d2.print();
        com.itheima.pkg.itcast.Demo2 d3 = new com.itheima.pkg.itcast.Demo2();
        d3.print();


    }
}
