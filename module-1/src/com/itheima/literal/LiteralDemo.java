package com.itheima.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        // TODO 常见数据在程序中的书写格式
        // 1.整数
        System.out.println(666);

        // TODO 2.小数
        System.out.println(99.5);

        // TODO 3.字符：必须要用单引号围起来，有且只能有一个字符
        System.out.println('a');
        System.out.println('0');
        System.out.println('中');
        System.out.println(' ');// 空字符
        // TODO System.out.println('');必须有一个字符
        // 特殊的字符：\n 代表的是换行的意思 \t代表的是一个tab
        System.out.println('中');
        System.out.println('\n');
        System.out.println('国');
        System.out.println('\t');

        // TODO 4.字符串：必须用双引号围起来，里面的内容其实可以随意
        System.out.println("我爱你中国abc");
        System.out.println("");
        System.out.println("  ");
        System.out.println("我");

        // TODO 5.布尔值：只有两个值 true false
        System.out.println(true);
        System.out.println(false);
    }
}
