package com.itheima.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        // TODO 掌握switch的写法，理解其执行流程
        // 周一：111   周二：222   周三：333
        // 周四：444  周五：555  周六：666   周日：777
        String week = "周日";
        switch(week){
            case "周一":
                System.out.println("111");
                break;
            case "周二":
                System.out.println("222");
                break;
            case "周三":
                System.out.println("333");
                break;
            case "周四":
                System.out.println("444");
                break;
            case "周五":
                System.out.println("555");
                break;
            case "周六":
                System.out.println("666");
                break;
            case "周日":
                System.out.println("777");
                break;
            default:
                System.out.println("其他");
        }
    }
}
