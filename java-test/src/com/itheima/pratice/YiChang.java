package com.itheima.pratice;

import com.itheima.pratice.YC.BusinessException;
import org.junit.Test;

public class YiChang {
    /* TODO 正则表达式
    matches:判断字符串是否匹配正则表达式，匹配返回true,反之false
    matches("[1-9]\\d{5,19}")
    [1-9]：代表第一位必须是1-9之间的数字
    \\d：代表全是数字：
    {5,19}：代表剩下的数字的位数，5-19位数字
     */



    @Test
    // TODO 方法一： 捕获异常 try-catch
    //  快捷键：ctrl+alt+t
    public void demo10(){
        try {
            System.out.println(judegNumber(8));
        } catch (Exception e) {
            e.printStackTrace();
//            BusinessException be = (BusinessException) e; // 强制转换 父类转换为子类
//            System.out.println(be.getCode());// 取到异常的属性
//            System.out.println(be.getMessage());// 取到异常的属性
        }
    // TODO 方法二：捕获异常
        try {
            System.out.println(jisuan(10, 5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


        // TODO 方法一：判断n的值，若不符合条件就抛出异常
        //   抛出自定义异常的固定格式：throw new 异常子类名
        //   抛出异常会打印(20, "传入的数据是负数")
    private int judegNumber(int n){
        if (n >=0 ){
            return n;
        } else {
            throw new BusinessException(20, "传入的数据是负数");// 固定格式
        }
    }

    // TODO 方法二：计算两个值的商，若值不符合条件就抛出异常
    //  抛出普通异常的固定格式 参数和大括号中间 throws Exception
    private int jisuan(int n1,int n2)throws Exception{
        return n1/n2;
    }
}
