package com.itheima.recursion;

import java.io.File;

// TODO 文件搜索的实现
public class RecursionTest2 {
    public static void main(String[] args) {
        searchFile(new File("C:/"),"LINE.lnk");
    }
    // 去目录下搜索某个文件 dir 目录     fileName 要搜索的文件名称
    public static void searchFile(File dir,String fileName){
        // 1.把非法的情况都拦截住
        if (dir == null || !dir.exists() || dir.isFile()){
            return;// 代表无法搜索
        }

        // 2.dir不是null ,存在，一定是目录对象
        // 获取当前目录下的全部一级文件对象
        File[] files = dir.listFiles();

        // 3.判断当前目录下是否存在一级文件对象，以及是否可以拿到一级文件对象
        if (files != null && files.length > 0){
            // 4.遍历全部一级文件对象
            for (File f : files) {
                // 5.判断文件是否是文件，还是文件夹
                if (f.isFile()){
                    // 是文件 判断文件名是否是我们要找的
                    if (f.getName().contains(fileName)){
                        System.out.println("找到了:" + f.getAbsolutePath());
                    }
                }else {
                    // 是文件夹 继续重复这个过程（递归）
                    searchFile(f,fileName);
                }
            }
        }
    }
}
