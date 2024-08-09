package com.itheima.pratice;

import org.junit.Test;

import java.util.Arrays;

public class test3 {
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

        // TODO 定义一个动态int数组并赋值 1 2 3 4
        int[] number = new int[4];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;

        // TODO 用以上数组new一个长度相同的新数组出来
        //  新数组内容为  new arr [1, 1 + 2, 1 + 2 + 3, 1 + 2 + 3 + 4]
        int[] number1 = new int[number.length];
        for (int i = 0; i < number1.length; i++) {

            int sum = 0;
            for (int t = 0; t <= i; t++) {
                sum += number[t];
            }

            number1[i] = sum;
        }
        System.out.println(Arrays.toString(number1));

        // TODO 定义一个int数组并遍历，只打印奇数，遇到偶像则continue
        int[] n = {1,2,3,4,5};
        //        0  1 2  3 4
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0){
                continue;
            }
            System.out.println(n[i]);
        }
    }
}
