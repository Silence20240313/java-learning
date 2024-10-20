package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // TODO 把所有的书都放在一个集合里
        ArrayList list = new ArrayList();
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
            if (choice == 1){
                System.out.println("[丽丽猫]书城 --> 1.展示书籍");
                // TODO 对集合进行遍历查看
                for (int i = 0; i < list.size(); i++) {
                   Book b = (Book)(list.get(i));
                    System.out.println(b.getbNo() + "-->" + b.getbName() + "-->" + b.getbAuthor());
                }
            }
            if (choice == 2){
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
                // TODO 在集合中添加书籍
                list.add(b);
            }
            if (choice == 3){
                System.out.println("[丽丽猫]书城 --> 3.下架书籍");
                // TODO 录入要下架的书籍编号
                System.out.println("请录入您要下架的书籍的编号");
                int delNo = sc.nextInt();
                // TODO 下架编号所对应的书籍
                for (int i = 0; i <= list.size()-1 ; i++) {
                    Book b = (Book)(list.get(i));
                    // 如果遍历的书籍编号和录入的要删除的书籍编号一致，那么从集合中移除该书籍即可
                    if (b.getbNo() == delNo){
                        list.remove(b);
                        System.out.println("该书籍下架成功");
                        break;// 如果下架成功，则停止遍历
                    }
                }
            }
            if (choice == 4){
                System.out.println("[丽丽猫]书城 --> 4.退出应用");
                // TODO break：停止正在执行的循环
                break;
            }
        }
    }
}
