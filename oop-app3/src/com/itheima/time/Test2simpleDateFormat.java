package com.itheima.time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test2simpleDateFormat {
    public static void main(String[] args) throws ParseException {
        // TODO SimpleDateFormat的使用
        // 1.准备一些时间
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        // 2.格式化日期对象和时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");

        String rs = sdf.format(d);
        System.out.println(rs);// 2024-07-29 20:50:55 周一 下午

        String rs2 = sdf.format(time);
        System.out.println(rs2);// 2024-07-29 20:50:55 周一 下午

        System.out.println("----------------------");

        // TODO SimpleDateFormat解析字符串时间成为日期对象
        String dateStr = "2022-12-12 12:12:11";
        // 1.需要创建简单日期格式化对象 指定的时间格式必须与被解析的时间格式一模一样，否则出bug
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(dateStr);
        System.out.println(d2);// Mon Dec 12 12:12:11 JST 2022
    }
}
