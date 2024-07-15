package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // TODO 掌握三元运算符的基本使用
        double score = 58.5;
        String rs = score >=60?"合格":"不合格";
        System.out.println(rs);

        // 需求2：找出两个整数中的较大值，并输出
        int a = 99;
        int b = 167;
        int max = a>b?a:b;
        System.out.println(max);

        // 需求3：找出三个整数中的较大值，并输出
        int i = 10;
        int j = 45;
        int k = 34;
        // 找出两个整数中的较大值
        int temp = i > j ? i : j;
        // 找出temp与k中的较大值
        int max2 = temp > k ? temp : k;
        System.out.println(max2);

        // &&的优先级高   先执行&&
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);// true
        //加了小括号，先执行||
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);// false


    }
}
