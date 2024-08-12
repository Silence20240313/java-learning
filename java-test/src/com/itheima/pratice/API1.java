package com.itheima.pratice;

import org.junit.Test;

public class API1 {
    @Test
    public void demo13(){
        // TODO 包装类的作用：不同类型的数据进行相互转换
        // 把String类型转换为double类型并输出
        String score = "99.5";
        double cj = Double.valueOf(score);
        System.out.println(cj);// 99.5

        // TODO StringBuilder  StringBuffer
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("9").append(9.5).append("汪汪"));// 9 9.5 汪汪  append:添加数据

    }
}
