## 1.前端
#### ①HTML
用各种各样的标签组成一个页面，可以被浏览器解析，解析之后可以在浏览器中展示页面
标准结构：
```java
<html>
       <head></head>
       <body>
              <h1>这是一个html页面 </h1>
       </body>
</html>
```
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/d390296a-292c-0f4c-8c16-fb40ca402431.png)
#### ②CSS
修饰HTML页面
#### ③JS
通过事件驱动实现网页内容动态变化，特效等
例如：点击按钮 弹出提示框
## 2.Maven(项目管理工具)
#### ①资源坐标
Groupld:逆向公司域名 com.msb
Artifactld:项目名（jar包） mysql-connector-java
Version:版本号
#### ②下载安装（解压即可）
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/a8af3fe8-f4fa-1ed5-7274-1fe88bdfc932.png)
#### ③配置本地仓库及JDK
在maven包下--conf--settings里指定本地仓库的位置：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/f2789a77-cb40-f2eb-9ed2-40ad1e8f9bcd.png)
在maven包下--conf--settings里<profiles>标签处配置JDK：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/473d2ac2-849f-f340-4884-ad75d9e8bb9b.png)
#### ④创建Maven项目
在IDEA中新建一个空项目-创建模块时选择Maven
在pom文件中导入相关依赖
## 3.常见框架分类
持久层框架：MyBatis(负责访问数据源的一层)
MVC框架：Spring MVC
项目管理框架：Spring Framework   Spring Boot
#### ①搭建第一个MyBatis框架
1.创建数据库表
t_book
2.创建Maven项目
TestMyBatis01
3.添加依赖
在pom文件中添加mybatis和mysql依赖
4.创建MyBatis全局配置文件
在resources下建xml文件：
```java
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
    <environments default="mysql">
        <environment id="mysql">
            <transactionManager type="JDBC"></transactionManager>
            <dataSource type="POOLED">
                <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
                <property name="url" value="jdbc:mysql://localhost:3306/wiki?useSSL=false&amp;characterEncoding=utf8&amp;serverTimezone=GMT%2B8
"/>
                <property name="username" value="root"/>
                <property name="password" value="root"/>
            </dataSource>
        </environment>
    </environments>
</configuration>
```
5.创建实体类
和数据库表保持一致
6.创建映射文件
在resources下建mapper xml文件：
```java
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="a.b">
    <!--id是方法名字  resultType是实体类的路径-->
    <select id="selectAllBooks" resultType="com.msb.pojo.Book">
        select * from t_book
    </select>
</mapper>
```
并在配置文件中配置mapper扫描
```java
<mappers>
        <mapper resource="mapper/BookMapper.xml"></mapper>
</mappers>
```
7.编写测试类，启动项目
```java
package com.msb.test;

import com.msb.pojo.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        // 指定核心配置文件的路径
        String resource = "mybatis.xml";
        // 获取加载配置文件的输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 加载配置文件，创建工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 通过工厂类获取一个会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行查询
        List list = sqlSession.selectList("a.b.selectAllBooks");
        // 遍历
        for (int i = 0; i <= list.size() - 1 ; i++) {
            Book b = (Book)list.get(i);
            System.out.println(b.getName() + b.getAuthor());
        }
        // 关闭资源
        sqlSession.close();
    }
}
```
## 4.MyBatis启动日志功能
#### ①在pom文件中添加依赖
```java
<dependency>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
      <version>1.2.17</version>
</dependency>
```
#### ②在resources中新建log4j.properties配置文件
日志级别：fatal致命错误--error错误--warn警告--info普通信息--debug调试信息--trace跟踪信息
只想看sql执行过程，整体调高，局部降低。将整个日志级别调为error，mapper.xml涉及的内容级别降低为trace
log4j.logger是固定的，a.b是命名空间的名字
```java
log4j.rootLogger = error,console

log4j.logger.a.b=TRACE

log4j.appender.console = org.apache.log4j.ConsoleAppender
log4j.appender.console.Target = System.out
log4j.appender.console.layout = org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern = [%p][%-d{yyyy-MM-dd HH\:mm\:ss}]%C.%M(%L)|%m%n
```
## 5.接口
类是类，接口是接口
接口：定义规则。  实现类：实现接口，实现规则
接口：用interface来表示
接口中的内容：常量 抽象方法
⭐常量：它的数值不能改变，一旦给定了值以后就不能更改（常量名：全部大写）
实现类实现接口，利用implements关键字
实现类实现接口后，重写接口中定义的抽象方法
接口不能创建对象，需要用接口指向实现类的形式创建对象（多态的形式）
继承：子类对父类的继承，提高代码的复用性。
实现：实现类对接口的实现，实现规则。
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/d5d8fd80-a7db-a82b-0256-e17602e2267d.png)
## 6.接口绑定方案
①创建新的Maven项目
②配置pom.xml
③配置全局配置文件
④配置数据库属性文件
⑤日志配置文件
⑥创建实体类
⑦创建接口
⑧创建映射文件：要求：namespace取值必须是接口的全限定路径，标签中的id属性值必须和方法名对应
⑨编写测试类：通过动态代理模式
## 7.参数传递问题
直接调用方法传递参数即可
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/68d0aa69-7e90-e587-83c6-a7bd0a69108e.png)
### ①获取数据方式-使用内置名称进行调用
#{}进行获取，{}中名字使用规则：arg0,arg1...
测试类中：
```java 
        Book book = mapper.selectOneBook("活着","余华");
        System.out.println(book.getName());
```
mapper.xml配置文件中：
```java 
<select id="selectOneBook" resultType="com.msb.pojo.Book">
        select * from t_book where name = #{arg0} and author = #{arg1}
</select>
```
mapper.java文件中：
```java 
public abstract Book selectOneBook(String name,String author);
```
### ②一个参数且参数为对象，获取参数
#{}进行获取，直接利用属性名即可
测试类中：
```java 
        Book b = new Book();
        b.setName("活着");
        b.setAuthor("余华");
        Book book = mapper.selectOneBook2(b);
        System.out.println(book.getName());     
```
mapper.xml配置文件中：
```java 
<select id="selectOneBook2" resultType="com.msb.pojo.Book">
        select * from t_book where name = #{name} and author = #{author}
</select>
```
mapper.java文件中：
```java 
public abstract Book selectOneBook2(Book book);
```
### ③多个参数且参数有对象，获取参数
#{}进行获取  argM.属性名/paramN.属性名
测试类中：
```java 
        Book b = new Book();
        b.setName("活着");
        b.setAuthor("余华");
        Book book = mapper.selectOneBook3("活着",b);
        System.out.println(book.getName());      
```
mapper.xml配置文件中：
```java 
<select id="selectOneBook3" resultType="com.msb.pojo.Book">
        select * from t_book where name = #{param1} and author = #{param2.author}
</select>
```
mapper.java文件中：
```java 
public abstract Book selectOneBook3(String name,Book book);
```
## 8.增加操作
①测试类中：
```java 
        Book b = new Book();
        b.setId(2);
        b.setName("红高粱");
        b.setAuthor("莫言");
        b.setPrice(88.6);
        int n = mapper.insertBook(b);
        if (n > 0){
            System.out.println("数据插入成功");
        }
        // 事务相关的操作
        sqlSession.commit();        
```
②mapper.xml配置文件中：
```java 
    <insert id="insertBook">
        insert into t_book(id,name,author,price) values(#{id},#{name},#{author},#{price})
    </insert>
```
③mapper.java文件中：
```java 
 public abstract int insertBook(Book book);
```
④日志配置文件中：
```java 
log4j.logger.com.msb.mapper.BookMapper=TRACE
```
⑤mybatis配置文件中
```java 
    <mappers>
        <mapper resource="com/msb/mapper/BookMapper.xml"></mapper>
    </mappers>
```