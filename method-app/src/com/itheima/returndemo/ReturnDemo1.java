package com.itheima.returndemo;

public class ReturnDemo1 {
    public static void main(String[] args) {
        // TODO return单独使用在无返回值方法中的作用：跳出并立即结束当前方法的执行
        chu(10,0);
    }
    public static void chu(int a,int b){
        if (b==0){
            System.out.println("数据有问题，不能除0");
            return;// 跳出并立即结束当前方法的执行
        }
         int c = a/b;
         System.out.println(c);
    }
}
