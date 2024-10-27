package com.msb.test01;

import java.sql.*;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
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
        ResultSet rs = sta.executeQuery("select * from t_book where price < 60");
        // 处理结果
        while (rs.next()){ // 判断是否有记录存在
            System.out.println(rs.getInt("id") + "---" + rs.getString("name") + "---" + rs.getString("author") + "---" + rs.getDouble("price"));
        }
        // 关闭资源
        sta.close();
        conn.close();
    }
}
