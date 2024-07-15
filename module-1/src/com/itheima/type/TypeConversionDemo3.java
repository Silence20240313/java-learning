package com.itheima.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        // TODO 掌握强制类型转换
        int a = 20;
        byte b = (byte) a;// alt+回车 再回车 强制类型转换
        System.out.println(a);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;// alt+回车 再回车 强制类型转换
        System.out.println(j);// -36

        double d = 99.5;
        int m = (int) d;// 强制类型转换
        System.out.println(m);// 99 丢掉小数部分 保留整数部分

    }
}
