package com.itheima.collection_list;

// TODO linkedList集合的使用

import java.util.LinkedList;

public class ListTest2 {
    public static void main(String[] args) {
       // 1.创建一个队列
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("第一号人");
        queue.addLast("第二号人");
        queue.addLast("第三号人");
        queue.addLast("第四号人");
        System.out.println(queue);// [第一号人, 第二号人, 第三号人, 第四号人]

        // 出队
        System.out.println(queue.removeFirst());// 第一号人
        System.out.println(queue.removeFirst());// 第二号人
        System.out.println(queue.removeFirst());// 第三号人
        System.out.println(queue);// [第四号人]

        System.out.println("------------------------------");

        // 1.创建一个栈对象
        LinkedList<String> stack = new LinkedList<>();
        // 压栈  push
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");
        System.out.println(stack);// [第四颗子弹, 第三颗子弹, 第二颗子弹, 第一颗子弹]
        // 出栈 pop
        System.out.println(stack.pop());// 第四颗子弹
        System.out.println(stack.pop());// 第三颗子弹
        System.out.println(stack.pop());// 第二颗子弹
        System.out.println(stack);// [第一颗子弹]
    }
}
