package com.itheima.parameter;

public class MethodTest2 {
    public static void main(String[] args) {
        // TODO 完成打印int类型的数组内容
        int[] arr = {10,30,50,70};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        // 直接遍历接到的数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1?arr[i]:arr[i]+", ");
        }
        System.out.println("]");
    }
}
