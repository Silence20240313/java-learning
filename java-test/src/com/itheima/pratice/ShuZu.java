package com.itheima.pratice;

import org.junit.Test;

import java.util.Arrays;

public class ShuZu {
    @Test
    public void demo3(){
        // TODO 定义一个静态字符串数组
        String[] names = {"张三","李四","王五","赵六"};

        // TODO 分别用for和while遍历这个数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("---------------------------");

        int j = 0;
        while (j < names.length) {
            System.out.println(names[j]);
            j++;
        }


        // TODO 定义一个int数组并遍历，只打印奇数，遇到偶像则continue
        int[] n = {1,2,3,4,5};
        //        0  1 2  3 4
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0){
                // n[i]:代表数组里的数值   i：代表数组的索引
                continue;
            }
            System.out.println(n[i]);
        }
    }
}
