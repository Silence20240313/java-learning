package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        // TODO stringjoiner的使用
        //StringJoiner s = new StringJoiner(", ");// 间隔符
        StringJoiner s = new StringJoiner(", ","[","]");// 间隔符
        s.add("java1");
        s.add("java2");
        s.add("java3");
        //System.out.println(s);// java1, java2, java3
        System.out.println(s);// [java1, java2, java3]
    }


        public static String getArrayData(int[] arr){
            // 1.判断arr是否为null
            if (arr == null){
                return null;
            }

            // 2.arr数组对象存在  arr = [11，22，33]
            StringJoiner s = new StringJoiner(", ","[","]");// 间隔符
            for (int i = 0; i < arr.length; i++) {
                s.add(arr[i] + "");
            }
           return s.toString();
        }
    }

