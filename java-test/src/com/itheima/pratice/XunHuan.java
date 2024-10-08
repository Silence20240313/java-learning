package com.itheima.pratice;

import org.junit.Test;

public class XunHuan {
    @Test
    public void demo2(){
        // TODO 运用switch循环(case后面冒号)
        String week = "周五";
        switch (week) {
            case "周一":
                System.out.println("今天是周一");
                break;//  break:跳出这个switch循环    continue:跳出当次循环
            case "周二":
                System.out.println("今天是周二");
                break;
            case "周三":
                System.out.println("今天是周三");
                break;
            case "周四":
                System.out.println("今天是周四");
                break;
            case "周五":
                System.out.println("今天是周五");
                break;
            case "周六":
                System.out.println("今天是周六");
                break;
            case "周日":
                System.out.println("今天是周日");
                break;
            default:
                System.out.println("您输入的信息有误");
        }

        // TODO 运用for循环  输出从1加到10的总和
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.println("1-10的总和为：" + sum);

        // TODO 运用for循环  输出从1加到10的偶数和
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
             if (i % 2 == 0) {
                sum1+=i;
             }
        }
        System.out.println("1-10的偶数和为：" +sum1);

        // TODO 运用while循环  计算从1加到20的和，当和超过50时，终止循环并输出当前的和
        int i = 0;
        int sum2 = 0;
        while (i <= 20) {
            sum2 += i;
            if (sum2 > 50){
                break;// 结束离它最近的循环
            }
            i++;
        }
        System.out.println("当前和为" + sum2);

        // TODO 运用while循环 计算从1加到30的奇数和，遇见偶数时continue
        int j = 0;
        int sum3 = 0;
        while (j <= 30) {
            if (j % 2 == 0){
                j++;
                continue;// 跳过当次循环  跳过就不执行continue后面的语句，重新到while
            }
            sum3 += j;
            ++j;
        }
        System.out.println("1-30的奇数和为：" + sum3);

        // TODO 循环嵌套：运用for循环 输出25遍 汪苏泷
        for (int k = 1; k <= 5 ; k++) {
            for (int l = 1; l <= 5 ; l++) {
                System.out.println("汪苏泷");
            }
        }

        System.out.println("--------------------------------------");

        // TODO 循环嵌套：运用while循环 输出9遍 汪苏泷
        //  while循环的格式：
        /*
        初始化语句；
        while（循环条件）{
              被重复执行的代码；
              迭代语句；
          }
        */

        int u = 0;// 先定义初始值
        while (u <= 2){
            int t = 0;// 先定义初始值
            while (t <= 2) {
                System.out.println("汪苏泷");
                t++;
            }
            u++;
        }
    }
}
