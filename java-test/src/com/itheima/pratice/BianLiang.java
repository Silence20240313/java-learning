package com.itheima.pratice;

import org.junit.Test;

public class BianLiang {
    @Test
    public void demo1(){
        // TODO 定义一个年龄变量，赋值25并输出。把年龄变更为30并输出
        int age = 25;
        System.out.println(age);
        age = 30;
        System.out.println(age);

        // TODO 运用三元运算符判断（※：记住三元运算符的格式）
        String a = age <= 50 ? "青年" : "老年";
        System.out.println(a);

        // TODO 声明字符及成绩变量，并用if判断属于哪个级别
        char c = 'A';
        char c1 = 'B';
        short score = 20;
        if (score >= 60) {
            System.out.println(c);
        } else if (score >= 0 && score < 60) {
            System.out.println(c1);
        } else {
            System.out.println("无级别");
        }

        // TODO 定义两个布尔值类型并赋予初始值  ①考试是否通过 ②是否回家
        // TODO 用if判断以下四种情况：①通过考试并且回家-夸奖 ②通过考试还没到家-等待
        //                        ③考试失败但到家-暴打  ④考试失败也没回家-等待暴打
        boolean isTestPass = false;
        boolean isHome = true;
        if (isTestPass == true && isHome == true) {
            System.out.println("夸奖");
        } else if (isTestPass == true && isHome == false) {
            System.out.println("等待");
        } else if (isTestPass == false && isHome == true) {
            System.out.println("暴打");
        } else if (isTestPass == false && isHome == false) {
            System.out.println("等待暴打");
        }

        // TODO  定义变量身高及体重，用if判断以下情况：
        //       ① 身高大于1.9   判断：体重 > 60 胖子       体重 <= 60  瘦子
        //       ②身高小于1.9   不需要输出任何内容
        long height = 1l;
        double weight = 80;
        if (height > 1.9) {
            if (weight > 60) {
                System.out.println("胖子");
            } else if (weight <= 60) {
                System.out.println("瘦子");
            }
        }

        // TODO  ①身高 > 1.9 并且 体重 >= 80  --- 校队
        //       ②身高 > 1.9 并且 体重 < 80  --- 回家
        //       ③其他-种地
        if (height > 1.9) {
            if (weight >= 80) {
                System.out.println("进校队");
            } else if (weight < 80) {
                System.out.println("回家");
            }
        } else {
            System.out.println("种地");
        }

        // TODO  定义变量：姓名  余额  布尔值（已转账 true）
        //       if判断是否转账 ① 转了 余额-3万然后 打印  ② 没转 把名字+余额 打印出来
        String name = "黄飞鸿";
        double money = 80000.0;
        boolean pay = false;
        if (pay == true) {
            money = money - 30000.0;
            System.out.println(money);
        } else if (pay == false) {
            System.out.println(name + money);
        }

        // TODO 定义一个字符类型的变量   两个num并赋予初始值
        // TODO 字符是加减乘除取余  打印加减乘除取余
        char operator = '%';
        int number1 = 10;
        int number2 = 2;
        if (operator == '+') {
            System.out.println(number1 + number2);
        } else if(operator == '-') {
            System.out.println(number1 - number2);
        } else if(operator == '*') {
            System.out.println(number1 * number2);
        } else if(operator == '/') {
            System.out.println(number1 / number2);
        } else if(operator == '%') {
            System.out.println(number1 % number2);
        } else {
            System.out.println("您输入的字符有问题");
        }

        // TODO  定义两个字符类型的变量   一个num并赋予初始值
        //      ①+ l: 先自增后打印  ②+ r:先打印再自增
        //      ③- l:先自减后打印   ④- r: 先打印后自减
        char operator2 = '-';
        char operator3 = 'r';
        int number3 = 15;
        if (operator2 == '+' && operator3 == 'l') {
            System.out.println(++number3);
        } else if (operator2 == '+' && operator3 == 'r') {
            System.out.println(number3++);
        } else if (operator2 == '-' && operator3 == 'l') {
            System.out.println(--number3);
        }else if (operator2 == '-' && operator3 == 'r') {
            System.out.println(number3--);
        }
    }
}
