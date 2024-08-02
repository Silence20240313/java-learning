package com.itheima.parameter;

import java.util.Arrays;

// TODO 可变参数及其作用
public class ParamTest1 {
    public static void main(String[] args) {
        // 特点
        test();// 不传数据  0   []
        test(10);//传一个数据  1  [10]
        test(12,20,30);//传多个数据  3  [12, 20, 30]
        test(new int[]{10,20,30,40});//传数组  4  [10, 20, 30, 40]
    }

    // 注意事项：一个形参列表中，只能有一个可变参数
    // 注意事项：可变参数必须放在形参列表的最后面
    public static void test(int...nums){
        // 可变参数在方法内部，本质就是一个数组
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("=======================");
    }
}
