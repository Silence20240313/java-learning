package com.itheima.demo;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        // TODO 删除非空文件夹，独立功能独立成方法
        File dir = new File("\u202AC:\\Users\\liang\\OneDrive\\デスクトップ\\test");
        deleteDir(dir);
    }
    public static void deleteDir(File dir){
       if (dir == null || !dir.exists()){
          return;
       }

       if (dir.isFile()){
           dir.delete();
           return;
       }

       // 1. dir存在且是文件夹 拿里面的一级文件对象
        File[] files = dir.listFiles();
       if (files == null){
           return;
       }

       // 2.这是一个有内容的文件夹 删除里面的内容再删除文件夹
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                deleteDir(file);
            }
        }
        dir.delete();
    }
}
