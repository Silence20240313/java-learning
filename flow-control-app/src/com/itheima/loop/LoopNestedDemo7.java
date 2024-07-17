package com.itheima.loop;

public class LoopNestedDemo7 {
    public static void main(String[] args) {
        // TODO 掌握循环嵌套的执行流程
        // 3天 每天5句我爱你
        for (int i = 1;i <= 3;i++){
            for (int j = 1;j <= 5;j++){
            System.out.println("我爱你:"+ i);
            }
            System.out.println("========================");
        }

        //打印三行四列星星
        for (int i = 1; i <= 3; i++) {
            // 定义一个循环控制每行打印多少列星星
            for (int j = 1; j <= 4 ; j++) {
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }
}
