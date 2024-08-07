## IO流        

###  File  
1.  创建对象  
![img_159.png](image3/img_159.png)  
![img_161.png](image3/img_161.png)  
![img_162.png](image3/img_162.png)  
```java
package com.itheima.file;

// TODO   File创建对象，代表具体文件的方案

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        // 1.创建一个File对象，指代某个具体的文件
        File f1 = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\新建 文本文档.txt");
        System.out.println(f1.length());// 文件大小  540

        File f2 = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\test");
        System.out.println(f2.length());

        // File对象，可以指代一个不存在的文件路径
        File f3 = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\aaa");
        System.out.println(f3.length());
        System.out.println(f3.exists());// false

        // 要定位的文件是在模块中，如何定位
        // 绝对路径 带盘符的
        // File f4 = new File("C:\\java-learning\\java-note\\file-io-app\\src\\itheima.txt");
        // 相对路径 不带盘符 默认直接去工程下寻找文件
        File f4 = new File("file-io-app\\src\\itheima.txt");
        System.out.println(f4.length());// 3
    }
}

```
![img_160.png](image3/img_160.png)  
2.  方法1：判断文件类型，获取文件信息  
![img_163.png](image3/img_163.png)  
```java
package com.itheima.file;
// TODO   File提供的判断文件类型，获取信息文件功能
import java.io.File;
public class FileTest2 {
    public static void main(String[] args) throws Exception {
        // 1.创建文件对象，指代某个文件
        File f1 = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\新建 文本文档.txt");

        // 2.判断当前文件对象，对应的文件路径是否存在，存在返回true
        System.out.println(f1.exists());// true

        // 3.判断当前文件对象指代的是否是文件，是文件返回true,反之
        System.out.println(f1.isFile()); // true

        // 4.判断当前文件对象指代的是否是文件夹，是文件夹返回true,反之
        System.out.println(f1.isDirectory());// false

        // 5.获取文件的名称 包含后缀
        System.out.println(f1.getName());// 新建 文本文档.txt

        // 6.获取文件的大小，返回字节个数
        System.out.println(f1.length());// 540

        // 7.获取文件的最后修改时间
        System.out.println(f1.lastModified());// 1722664222184

        // 8.获取创建文件对象时，使用的路径
        File f2 = new File("file-io-app\\src\\itheima.txt");
        System.out.println(f2.getPath());// file-io-app\src\itheima.txt

        // 9.获取绝对路径
        File f3 = new File("file-io-app\\src\\itheima.txt");
        System.out.println(f3.getAbsolutePath());// C:\java-learning\java-note\file-io-app\src\itheima.txt

    }
}

```  
3.  方法2：创建文件，删除文件  
![img.png](img.png)  
```java
package com.itheima.file;
// TODO   File创建和删除文件相关的方法

import java.io.File;

public class FileTest3 {
    public static void main(String[] args) throws Exception {
        // 1.创建一个新文件（文件内容为空），创建成功返回true,反之
        File f1 = new File("C:/resource/itheima2.txt");
        System.out.println(f1.createNewFile());

        // 2.用于创建文件夹，注意，只能创建一级文件夹
        File f2 = new File("C:/resource/aaa");
        System.out.println(f2.mkdir());

        // 3.用于创建文件夹，注意，可以创建多级文件夹
        File f3 = new File("C:/resource/bbb/ccc/ddd");
        System.out.println(f3.mkdirs());

        // 4.删除文件或者空文件，注意，不能删除非空文件
        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }
}

```
4.  方法3：遍历文件夹  
![img_1.png](img_1.png)  
```java
package com.itheima.file;
// TODO   File提供的遍历文件夹的方法
import java.io.File;

public class FileTest4 {
    public static void main(String[] args) throws Exception {
        // 1.获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回
        File f1 = new File("C:\\code");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
            // javasepro
            //得奖的是
            //汪苏泷
            //雨天
        }

        // 2.重点：获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            // C:\code\javasepro
            //C:\code\得奖的是
            //C:\code\汪苏泷
            //C:\code\雨天
        }
    }
}

```
###  方法递归  
1.  递归的形式  
![img_2.png](img_2.png)  
![img_3.png](img_3.png)  
```java
package com.itheima.recursion;

// TODO 递归的形式
public class RecursionTest1 {
    public static void main(String[] args) {
        test1();
    }

    // 直接方法递归
    public static void test1(){
        System.out.println("-----test1------");
        test1();// 直接方法递归
    }

    // 间接方法递归
    public static void test2(){
        System.out.println("-----test2------");
        test3();
    }

    public static void test3(){
        System.out.println("-----test3------");
        test2();// 间接递归
    }
}

```
2.  应用，执行流程，算法思想  
![img_4.png](img_4.png)  
![img_5.png](img_5.png)   
![img_6.png](img_6.png)  
3.  文件搜索  
![img_7.png](img_7.png)  
```java
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

```
```java
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

```



