package com.itheima.arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest1 {
    public static void main(String[] args) {
        // 1.返回数组的内容
        int[] arr = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));// [10, 20, 30, 40, 50, 60]

        // 2.拷贝数组：指定范围，包前不包后
        int[] arr2 = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(arr2));// [20, 30, 40]

        // 3.拷贝数组，可以指定新数组的长度
        int[] arr3 = Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr3));// [10, 20, 30, 40, 50, 60, 0, 0, 0, 0]

        // 4.把数组中的原数据改为新数据又存进去
        double[] prices = {99.8,128,100};
        // 把所有的价格都打八折，然后又存进去
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // value 取索引
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));//  [79.84, 102.4, 80.0]

        // 5.对数组进行排序，默认升序排序
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));// [79.84, 80.0, 102.4]
    }
}
