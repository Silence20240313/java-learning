package com.itheima.loop;

public class WhileTest4 {
    public static void main(String[] args) {
        // TODO 使用While循环解决问题，并理解什么情况下使用While，for
        // 1.定义变量，记住珠穆朗玛峰的高度和纸张的高度
        double peakHeight = 8848860;
        double paperThickness = 0.1;

        // 3.定义一个变量count 用于记住纸张折叠了多少次
        int count = 0;

        // 2.定义While循环，控制纸张开始折叠
        while (paperThickness < peakHeight){
            // 把纸张进行折叠 把纸张的厚度变成原来的两倍
            paperThickness = paperThickness * 2;
            count++;
        }
        System.out.println(count);
        System.out.println(paperThickness);
    }
}
