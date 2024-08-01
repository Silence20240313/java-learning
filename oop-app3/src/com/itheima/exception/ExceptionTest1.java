package com.itheima.exception;
public class ExceptionTest1 {
    public static void main(String[] args) throws AgeIllegalException {
        // 需求：保存一个合法的年龄
        try {
            savaAge(23);
            System.out.println("底层执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了bug");
        }
        try {
            savaAge2(25);
            System.out.println("savaAge2底层执行成功");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("savaAge2底层执行失败");
        }
    }
    public static void savaAge2(int age)throws AgeIllegalException{
        if (age > 0 && age < 158){
            System.out.println("保存年龄为:"+ age);
        }else {
            // 用一个异常对象来封装这个问题
            // throw 抛出去这个异常对象
            // throws 用在方法上，抛出方法内部的异常
            throw new AgeIllegalException("/age is illegal,your age is"+ age);
        }
    }
    public static void savaAge(int age){
        if (age > 0 && age < 158){
            System.out.println("保存年龄为:"+ age);
        }else {
            // 用一个异常对象来封装这个问题
            // throw 抛出去这个异常对象
            throw new AgeIllegalRuntimeException("/age is illegal,your age is"+ age);
        }
    }
}
