package com.itheima.resource;

// TODO 认识 try-catch-finally
public class Test1 {
    public static void main(String[] args) {
        try{
            System.out.println(10/5);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("-----finally执行了一次-------");
        }

        System.out.println(chu(10,2));
    }

    public static int chu(int a,int b){
        try {
            return a/b;
        }catch (Exception e){
            e.printStackTrace();
            return -1;// 代表出现异常
        }finally {
           // 千万不要在finally中返回数据
        }
    }
}
