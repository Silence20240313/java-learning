package com.itheima.define;

public class ArrayTest4 {
    public static void main(String[] args) {
        // TODO 对数组元素求和
        // 1.定义一个数组，存储五名员工的销售额
        int[] money = {16,26,36,6,100};
        //             0   1  2  3  4

        // 3.定义一个变量 用于累加求和
        int sum = 0;

        // 2.遍历这个数组中的每个数据
        for (int i = 0; i < money.length; i++) {
            // i = 0 1 2 3 4
            sum += money[i];
        }
        System.out.println(sum);
    }
}

