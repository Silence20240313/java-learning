package com.itheima.pratice;

import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class API2 {
    @Test
    public void demo14()throws Exception {
    // TODO 1.使用Math类库，打印下列的值
    //  ①绝对值（abs）:-50 100      ②向上取整（ceil）:5.3 5  ③向下取整（floor）:5.3 5
    //  ④四舍五入（round）：4.4 4.5  ⑤最大值（max）：10，20   ⑥最小值（min）： 10，20
        System.out.println(Math.abs(-50));// 50
        System.out.println(Math.abs(100));// 100
        System.out.println(Math.ceil(5.3));// 6
        System.out.println(Math.ceil(5));// 5
        System.out.println(Math.floor(5.3));// 5
        System.out.println(Math.floor(5));// 5
        System.out.println(Math.round(4.4));//4
        System.out.println(Math.round(4.5));// 5
        System.out.println(Math.max(10, 20));// 20
        System.out.println(Math.min(10, 20));// 10

    // TODO 2.使用System类库,打印当前时间的毫秒数
        // currentTimeMillis():获取当前时间的毫秒值
        long l = System.currentTimeMillis();
        System.out.println(l);// 1723535093673

    // TODO 3.创建BigDecimal对象,对BigDecimal对象实现加减乘除
    //    BigDecimal:解决小数运算失真的问题
        double a = 0.1;
        double b = 0.2;
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        System.out.println(a1.add(b1));// 0.3 加：add
        System.out.println(a1.subtract(b1));// -0.1 减：subtract
        System.out.println(a1.multiply(b1));// 0.02 乘：multiply
        System.out.println(a1.divide(b1));// 0.5 除：divide

    // TODO 4.Date 及 SimpleDateFormat（简单日期格式化）
        // format 是 SimpleDateFormat 类的一个方法，用于将一个 Date 对象格式化为指定格式的字符串。
        Date d1 = new Date();
        System.out.println(d1);// Tue Aug 13 16:58:35 JST 2024  当前日期时间

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");// 设置日期格式化
        String format = sdf.format(d1);// 把当前日期时间按照格式，格式化
        System.out.println(format);// 2024-08-13 16:58:35 周二 下午

        // TODO 把string代表的字符串，转换成Date对象
        // parse 是 SimpleDateFormat 类的一个方法，用于将表示日期的字符串解析成 Date 对象。
        String dateStr = "2024-8-13 16:58:35";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(dateStr);
        System.out.println(d2);// Tue Aug 13 16:58:35 JST 2024

    // TODO 5.使用Arrays类库，对数据进行排序
        // sort 对元素进行升序排序
        double[] arr = {16.83,95,44.6,73.2};
        Arrays.sort(arr);// 升序排序
        System.out.println(Arrays.toString(arr));// [16.83, 44.6, 73.2, 95.0]
        // Arrays.toString(arr) 方法将数组 arr 转换为字符串形式
    }
}
