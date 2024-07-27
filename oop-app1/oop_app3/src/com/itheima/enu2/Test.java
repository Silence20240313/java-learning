package com.itheima.enu2;

public class Test {

    public static void main(String[] args) {
        // TODO 枚举的应用场景
        // check(1);
        // check(Constant.BOY);
        check(Constant2.BOY);
    }
    public static void check(Constant2 sex){
       switch (sex){
           case BOY:
               System.out.println("展示健身图片");
               break;
           case GIRL:
               System.out.println("展示美甲图片");
               break;
       }
    }
}
