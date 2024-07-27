package com.itheima.generics_attention;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // TODO 泛型的注意事项
        // 1.
        ArrayList<String> list = new ArrayList<>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        String rs = list.get(2);
        System.out.println(rs);

        // 2.
        // ArrayList<int> list1 = new ArrayList<>();
        // ArrayList<double> list2 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(23.3);
    }
}
