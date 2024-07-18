package com.itheima.parameter;

public class MethodTest3 {
    public static void main(String[] args) {
        // TODO 完成判断两个int类型的数组是否一样
        int[] arr1 = {10,20,30,40};
        int[] arr2 = {3,5,7,9,0,1};
        System.out.println(equals(arr1, arr2));
    }
    public static boolean equals(int[]arr1,int[]arr2){
        // 1.判断两个数组是否都是null
        if (arr1 == null && arr2 == null){
            return true;// 相等的
        }

        // 2.判断其中是否有一个是null
        if (arr1 == null || arr2 == null){
            return false;// 不相等
        }

        // 3.判断长度是否一样，如果不一样，返回false
        if (arr1.length != arr2.length){
            return false;// 不相等
        }

        // 4.长度一样，接着比较内容是否一样
        // arr1 = {10,20,30}
        // arr2 = {10,20,30}
        for (int i = 0; i < arr1.length; i++) {
            // 判断当前位置两个数组的元素是否不一样，不一样，直接返回false
            if (arr1[i] != arr2[i]){
                return false;// 不相等
            }
        }
        return true;// 相等的
    }
}
