package com.itheima.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        // TODO 掌握if分支三种形式的用法和执行流程
        // 需求：测量用户体温，高于37度就报警
        double t = 38.9;
        if ( t>37 ){
            System.out.println("体温异常");
        }

        // 需求；发红包：余额99元，发出90元。余额够，发红包；余额不足则需提示
        double money = 82;
        if (money >= 90){
            System.out.println("发红包！");
        }else {
            System.out.println("余额不足");
        }

        // 需求：绩效系统根据员工打分输出对应的绩效级别
        //0-60；D    60-80：C      80-90：B     90-100：A
        int score = 78;
        if (score >= 0 && score < 60){
            System.out.println("D");
        } else if (score >= 60 && score < 80) {
            System.out.println("C");
        }else if (score >= 80 && score < 90) {
            System.out.println("B");
        }else if (score >= 90 && score <= 100) {
            System.out.println("A");
        }else {
            System.out.println("输入错误");
        }
    }
}
