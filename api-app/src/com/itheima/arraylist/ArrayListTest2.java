package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList的集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特技枸杞");
        list.add("枸杞子");
        System.out.println(list);// [Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特技枸杞, 枸杞子]

        // 2.开始完成需求：从集合中找出包含枸杞的数据并删除他
        /* for (int i = 0; i < list.size(); i++) {
            // i = 0 1 2 3 4 5
            //取出当前遍历到的数据
            String ele = list.get(i);
            // 判断这个数据中是否包含枸杞
            if (ele.contains("枸杞")){
                // 直接从集合中删除该数据
                list.remove(ele);
            }
        }
        System.out.println(list);*/  // [Java入门, 黑枸杞, 人字拖, 枸杞子]


        // TODO 方式1：每次删除一个数据后，就让i往左边退一步
        /*for (int i = 0; i < list.size(); i++) {
            // i = 0 1 2 3 4 5
            //取出当前遍历到的数据
            String ele = list.get(i);
            // 判断这个数据中是否包含枸杞
            if (ele.contains("枸杞")){
                // 直接从集合中删除该数据
                list.remove(ele);
                i--;
            }
        }
        System.out.println(list);*/   // [Java入门, 人字拖]

        // TODO 方式2：从集合的后面倒着遍历并删除
        for (int i = list.size()-1; i >= 0 ; i--) {
            //取出当前遍历到的数据
            String ele = list.get(i);
            // 判断这个数据中是否包含枸杞
            if (ele.contains("枸杞")) {
                // 直接从集合中删除该数据
                list.remove(ele);
            }
        }
        System.out.println(list); // [Java入门, 人字拖]
    }
}
