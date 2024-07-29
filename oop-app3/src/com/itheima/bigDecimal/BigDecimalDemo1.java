package com.itheima.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo1 {
    public static void main(String[] args) {
        // TODO BigDecimal的使用，解决小数运算失真的问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b ;
        System.out.println(c);// 0.30000000000000004
        System.out.println("-------------------------");

        // 1.把他们变成字符串再封装成BigDecimal对象来运算
        // BigDecimal a1 = new BigDecimal(Double.toString(a));
        // BigDecimal b1 = new BigDecimal(Double.toString(b));
        // 推荐用以下方式，把小数转换成字符串再得到BigDecimal对象来运算
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        // BigDecimal c1 = a1.add(b1);// 加
        // BigDecimal c1 = a1.subtract(b1);// 减
        // BigDecimal c1 = a1.multiply(b1);// 乘
         BigDecimal c1 = a1.divide(b1);// 除
         System.out.println(c1);

        BigDecimal i = BigDecimal.valueOf(0.1);
        BigDecimal j = BigDecimal.valueOf(0.3);
        BigDecimal k = i.divide(j,2, RoundingMode.HALF_UP);// 除法
        System.out.println(k);

        // 把BigDecimal对象转换成double类型的数值
        double rs = k.doubleValue();
        System.out.println(rs);
    }
}
