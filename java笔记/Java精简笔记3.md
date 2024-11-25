## 1.创建数据库表
①创建表SQL
```java
create table t_book(
    id int,
    name varchar(20),
    author varchar(10),
    price double
);
```
②增加
```java
insert into t_book (id,name,author,price) values(1,'活着','余华',36.9);
insert into t_book (id,name,author,price) values(2,'黄高梁','莫言',58.4);
```
③删除
```java
delete from t_book where id = 2;
```
④修改
```java
update t_book set price = 88 where id = 1;
```
⑤查看
```java
select * from t_book;
select name,author from t_book;
select * from t_book where price > 40;
```
## 2.JDBC
#### ①下载jar包并导入
在工程中导入
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/e448729d-91b8-2abd-6700-3daabc0f2303.png)

#### ②JDBC访问数据库编码步骤
1.加载Driver驱动
2.获取数据库连接
3.创建会话-sql命令发送器
4.发送sql命令并得到结果
5.处理结果
6.关闭数据库资源
```java
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
        // 发送SQL
        int i = sta.executeUpdate("insert into t_book(id,name,author,price) values(3,'java','赵姗姗',50)");
        // 处理结果
        if (i > 0){ // 证明对数据库的条数有影响
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }
        // 关闭资源
        sta.close();
        conn.close();
    }
}
```
插入成功
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/d767a139-6974-a5a8-d5b3-16cff5fdfc0f.png)
## 3.JDBC查询数据
```java
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
```
3---java---赵姗姗---50.0##
## 4.书城案例-数据库sql
①根据书籍编号查询书籍信息
②查询所有书籍信息
③删除指定书籍编号对应的书籍
④退出应用
```java
public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO while (true) 死循环
        while (true) {
            // TODO 菜单
            System.out.println("----欢迎来到[丽丽猫]书城----");
            System.out.println("1.根据书籍编号查询书籍信息");
            System.out.println("2.查询所有书籍信息");
            System.out.println("3.删除指定书籍编号对应的书籍");
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
                // 查询所有书籍信息
                ArrayList books = findBooks();
                if (books.size() == 0){
                    System.out.println("没有查询到书籍");
                }else {
                    for (int i = 0; i <= books.size() - 1 ; i++) {
                        Book b = (Book)books.get(i);
                        System.out.println(b.getId() + "--" + b.getName());
                    }
                }
            }
            if (choice == 3){
                // 录入删除的书籍的编号
                System.out.println("请录入您想要删除的书籍的编号");
                int bno = sc.nextInt();
                // 删除指定书籍编号对应的书籍
                int n = delBookByBno(bno);
                if (n <= 0){
                    System.out.println("删除失败");
                }else {
                    System.out.println("删除成功");
                }

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

    public static ArrayList findBooks() throws ClassNotFoundException, SQLException {
        // 定义集合
        ArrayList list = new ArrayList();
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
        ResultSet rs = sta.executeQuery("select * from t_book ");
        // 处理结果
        while (rs.next()){
            // 先将结果做接收
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String author = rs.getString("author");
            double price = rs.getDouble("price");
            // 将上面的数据封装为一个Book对象
            Book b = new Book();
            b.setId(id);
            b.setName(name);
            b.setAuthor(author);
            b.setPrice(price);
            // 将书籍放入集合中去
            list.add(b);
        }
        // 关闭资源
        sta.close();
        conn.close();

        return list;
    }

    public static int delBookByBno(int bno) throws ClassNotFoundException, SQLException {
        // 加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 获取连接
        String url = "jdbc:mysql://localhost:3306/wiki?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8\n";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url,username,password);
        // 创建会话
        Statement sta = conn.createStatement();
        // 发送SQL
        int n = sta.executeUpdate("delete  from t_book where id = " + bno );
        // 关闭资源
        sta.close();
        conn.close();

        return n;
    }
}
```
