package com.itheima.pratice;

import java.io.File;

public class FileTest {
    public static void main(String[] args) throws Exception {
        // TODO 1.判断文件类型，获取文件信息
        //      2.创建文件，删除文件
        //      3.遍历文件夹

        // TODO 第一部分
        // 创建文件对象，指代某个文件
        File f = new File("C:\\Users\\liang\\OneDrive\\デスクトップ\\汪汪演唱会.txt");// 已有的文件夹路径

        System.out.println(f.exists());// true  判断当前文件，路径是否存在，存在返回true
        System.out.println(f.isFile());// true  判断当前文件，是否是文件，是返回true
        System.out.println(f.isDirectory());// false 判断当前文件，是否是文件夹，是返回true
        System.out.println(f.getName());// 汪汪演唱会.txt  获取文件名称带后缀
        System.out.println(f.length());// 41 获取文件大小，返回字节个数
        System.out.println(f.lastModified());// 1723619264461 获取文件的最后修改时间 毫秒值
        // 获取路径:f.getPath();     获取绝对路径: f.getAbsolutePath();

        // TODO 第二部分
        // 创建一个新文件（文件内容为空）,创建成功返回true
        File f1 = new File("C:\\code\\东京.txt");
        System.out.println(f1.createNewFile());// true createNewFile：确认文件是否创建成功
        // 创建文件夹:只能创建一级文件夹
        File f2 = new File("C:\\code\\日本");
        System.out.println(f2.mkdir());// true  mkdir:是用来创建目录的方法。 一级
        // 创建文件夹:可以创建多级文件夹
        File f3 = new File("C:\\code\\大版\\京都\\北海道");
        System.out.println(f3.mkdirs());// true mkdirs:是用来创建多级目录的方法 多级
        // 大版文件夹里有京都文件夹，京都文件夹里有北海道文件夹 文件夹层层嵌套
        // 删除文件或者空文件
        System.out.println(f1.delete());// true

        // TODO 第三部分
        // 1.获取当前目录下所有的“一级文件名称”到一个字符串数组中去返回
        File f4 = new File("C:\\演唱会");
        String[] names = f4.list();
        // list:是用来获取目录中所有文件和子目录名称的方法。
        for (String name : names) {
            System.out.println(name);
            // 南京 武汉 苏州 郑州
        }
        // 2.获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回
        File[] files = f4.listFiles();
        // istFiles():返回的是目录中所有文件和子目录的 File 对象数组
        for (File file : files) {
            System.out.println(file.getAbsolutePath());// 获取绝对路径
            // C:\演唱会\南京
            // C:\演唱会\武汉
            // C:\演唱会\苏州
            // C:\演唱会\郑州
        }
    }
}
