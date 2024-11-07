package com.itheima.branch;

public class Test {
    public static void main(String[] args) {
        System.out.println('\n');  // \n 代表的是换行的意思
        System.out.println('\t'); // \t  代表的是一个tab(缩进)


        // 格式：数据类型 变量名称 = 数据；
        //       int     age     18
        int age = 18;  // 变量名称首字母小写:age

        //自动类型转换：int转为double
        int n = 10;
        double b = n;
        System.out.println(b);// 10.0

        // 强制类型转换：double转为int
        double d = 10.5;
        int i = (int) d;
        System.out.println(i);// 10
        System.out.println("//////////////");

        char ch = 'a';
        int t = ch;
        System.out.println(t);
        System.out.println("//////////////");

        // 先加后运算
        int o = 10;
        int w = ++o;
        System.out.println(w);// 11
        System.out.println(o);// 11
        // 先运算后加
        int q = 5;
        int r = q++;
        System.out.println(q);// 6
        System.out.println(r);// 5

        System.out.println("----");





    }
}
