package test2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        // TODO while (true) 死循环
        while (true) {
            // TODO 菜单
            System.out.println("----欢迎来到[丽丽猫]书城----");
            System.out.println("1.展示书籍");
            System.out.println("2.上架书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            //TODO 借助Scanner类(键盘录入的数据扫描到程序中来)
            Scanner sc = new Scanner(System.in);
            // TODO 给用户提示
            System.out.println("请输入您想要执行操作的序号");
            // TODO 利用键盘录入序号(扫描int类型的数据)
            int choice = sc.nextInt();
            // TODO 根据序号进行后续判断


            if (choice == 1) {
                System.out.println("[丽丽猫]书城 --> 1.展示书籍");
                // TODO 从文件中读取list
                File f = new File("C:\\io\\test222.txt");
                // TODO 对f做判断
                if (f.exists() == true) { // 文件存在
                    // TODO 管道流
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    // TODO 读取集合
                    ArrayList list = (ArrayList) (ois.readObject());// list -- 从文件中读取的集合
                    // TODO 对集合进行遍历查看
                    for (int i = 0; i < list.size(); i++) {
                        Book b = (Book) (list.get(i));
                        System.out.println(b.getbNo() + "-->" + b.getbName() + "-->" + b.getbAuthor());
                    }
                } else { // 文件不存在
                    System.out.println("当前还没有上新书籍，请先上新书籍再进行书籍展示");
                }
            }


            if (choice == 2) {
                System.out.println("[丽丽猫]书城 --> 2.上架书籍");
                // TODO 从键盘录入书籍的信息：编号/名称/作者
                System.out.println("请录入书籍的编号:");
                int bNo = sc.nextInt();
                System.out.println("请录入书籍的名称:");
                String bName = sc.next();
                System.out.println("请录入书籍的作者:");
                String bAuthor = sc.next();
                // TODO 创建书籍类对象
                Book b = new Book();
                // TODO 键盘录入的信息与书籍类对象结合到一起
                b.setbNo(bNo);
                b.setbName(bName);
                b.setbAuthor(bAuthor);
                // TODO 从文件中读取list
                File f = new File("C:\\io\\test222.txt");
                // TODO 对f做判断
                if (f.exists() == true) { // 如果文件存在，证明之前文件的集合中已经有书籍了
                    // TODO 管道流
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    // TODO 读取集合
                    ArrayList list = (ArrayList) (ois.readObject());// list -- 从文件中读取的集合
                    // TODO TODO 集合读取出来以后再追加新的书籍
                    list.add(b);
                    // TODO 将这个集合写出去
                    // TODO 管道流
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    // TODO 将list写出
                    oos.writeObject(list);
                    // TODO 关闭流
                    oos.close();
                } else { // 如果文件不存在，证明是第一次上新书籍
                    // TODO 在集合中添加书籍
                    // TODO 把所有的书都放在一个集合里
                    ArrayList list = new ArrayList();
                    list.add(b);
                    // TODO 管道流
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    // TODO 将list写出
                    oos.writeObject(list);
                    // TODO 关闭流
                    oos.close();
                }
            }


            if (choice == 3) {
                System.out.println("[丽丽猫]书城 --> 3.下架书籍");
                System.out.println("请选择要下架的书籍的编号");
                int bNo = sc.nextInt();
                File f = new File("C:\\io\\test222.txt");
                if (f.exists() == true) {
                    // TODO 管道流
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    // TODO 读取集合
                    ArrayList list = (ArrayList) (ois.readObject());// list -- 从文件中读取的集合
                    // TODO 遍历list集合
                    for (int i = 0; i < list.size(); i++) {
                        Book b = (Book) (list.get(i));
                        if (b.getbNo() == bNo) {
                            list.remove(i);
                            System.out.println("编号为:" + bNo + "的书籍已删除");
                            break; // 删除以后，停止循环
                        }
                    }
                    // TODO 管道流
                    FileOutputStream fos = new FileOutputStream(f);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    // TODO 将list写出
                    oos.writeObject(list);
                    // TODO 关闭流
                    oos.close();
                } else {
                    System.out.println("对不起，没有查到此书的编号");
                }
            }


            if (choice == 4) {
                System.out.println("[丽丽猫]书城 --> 4.退出应用");
                // TODO break：停止正在执行的循环
                break;
            }
        }
    }
}
