package com.itheima.collection_list;

import java.util.ArrayList;
import java.util.List;

// TODO List系列集合的特点，及其提供的特有方法
public class ListTest1 {
    public static void main(String[] args) {
        // 1.有序 可重复 有索引
        List<String> list = new ArrayList<>();// 经典代码
        list.add("蜘蛛精");
        list.add("至尊宝");
        list.add("至尊宝");
        list.add("牛夫人");
        System.out.println(list);// [蜘蛛精, 至尊宝, 至尊宝, 牛夫人]

        // 2.在某个索引位置插入元素
        list.add(2,"紫霞仙子");
        System.out.println(list);// [蜘蛛精, 至尊宝, 紫霞仙子, 至尊宝, 牛夫人]

        // 3.根据索引删除元素，返回被删除元素
        System.out.println(list.remove(2));// 紫霞仙子
        System.out.println(list);// [蜘蛛精, 至尊宝, 至尊宝, 牛夫人]

        // 4.返回集合中指定位置的元素
        System.out.println(list.get(3));// 牛夫人

        // 5.修改索引位置处的元素，修改成功后，会返回原来的数据
        System.out.println(list.set(3, "牛魔王"));// 牛夫人
        System.out.println(list);// [蜘蛛精, 至尊宝, 至尊宝, 牛魔王]
    }
}
