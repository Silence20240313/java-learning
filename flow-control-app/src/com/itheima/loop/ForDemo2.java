package com.itheima.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        // TODO 掌握使用for循环批量产生数据
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(i);
        }

        // 需求：求1-5的数据和
        // 2.定义一个变量用于求和
        int sum = 0;
        // 1.定义一个循环，先产生1-5，这五个数
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 需求：1-100的奇数和(方法1)
        // 2.定义一个变量用于求和
        int sum1 = 0;
        // 1.定义一个循环，产生1-100之间的奇数
        for (int i = 1; i < 100; i+=2) {
            sum1 += i;
        }
        System.out.println(sum1);

        // 需求：1-100的奇数和(方法2)
        // 3.定义一个变量用于累加奇数求和
        int sum2 = 0;
        // 1.定义一个循环，产生1-100之间的每个数据
        for (int i = 1; i <= 100 ; i++) {
            // 2.使用一个if分支，判断i此时记住的数据是否是奇数，是奇数我们才累加给一个变量
            if (i % 2 == 1){
                sum2 += i;
            }
            System.out.println(sum2);
        }
    }
}
