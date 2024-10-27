package test1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
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
                // 键盘录入书籍编号
                System.out.println("请录入您想要查看的书籍的编号");
                int bno = sc.nextInt();
                // 根据编号查询对应的书籍
                Book b = findBookByBno(bno);
                // 通过b的结果来判定书籍是否查询到
                if (b == null){ // 书籍不存在
                    System.out.println("您想要查询的书籍不存在");
                }else {// 书籍存在
                    System.out.println("当前查询到一本书:《" + b.getName() + "》");
                }
            }
            if (choice == 2){

            }
            if (choice == 3){

            }
            if (choice == 4){
                System.out.println("[丽丽猫]书城 --> 4.退出应用");
                // TODO break：停止正在执行的循环
                break;
            }
        }
    }

    // 根据编号查询对应的书籍
    public static Book findBookByBno(int bno) throws ClassNotFoundException, SQLException {
        Book b = null;
        // 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 获取连接
        String url = "jdbc:mysql://localhost:3306/wiki?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8\n";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);
        // 创建会话
        Statement sta = conn.createStatement();
        // 发送SQL  ResultSet结果集合
        ResultSet rs = sta.executeQuery("select * from t_book where id = " + bno);
        // 处理结果
        if (rs.next()){ // 如果结果只有一条 想要获取的话 写if 就可以
            // 先将结果做接收
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            double price = rs.getDouble("price");
            // 将上面的数据封装为一个Book对象
            b = new Book();
            b.setId(id);
            b.setName(name);
            b.setAuthor(author);
            b.setPrice(price);
        }
        // 关闭资源
        sta.close();
        conn.close();

        return b;
    }
}
