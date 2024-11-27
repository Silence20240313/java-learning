## 1.分层
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/25e5998f-c36c-f234-7a1f-72d232ef4fba.png)
## 2.第一个Spring项目-完成IOC/DI代码的实现
①创建项目，添加依赖
```java
    <dependency>
      <groupId>org.springframework</groupId>
      <artifactId>spring-context</artifactId>
      <version>5.3.23</version>
    </dependency>
```
②创建一个类
③创建Spring配置文件
在resources下新建applicationContext.xml
```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id = "b" class = "com.msb.pojo.Book"></bean>
</beans>
```
④测试
```java
public class Test {
    public static void main(String[] args) {
        // 创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取对象
        Book book = (Book)context.getBean("b");
        // 打印对象的信息
        System.out.println(book.getName() + "---" + book.getId());
    }
}
```
⑤观察结果
## 3.属性注入方式介绍
set方式--属性注入：设值注入
构造器方式--属性注入：构造注入
```java
    <bean id = "b" class = "com.msb.pojo.Book">
        <property name="id" value="1"></property>
        <property name="name" value="活着"></property>
    </bean>
```
```java
    <bean id = "b2" class = "com.msb.pojo.Book">
        <property name="id" value="2"></property>
        <property name="name" value="红高粱"></property>
    </bean>
```
## 4.属性为引用数据类型
女孩类：年龄 姓名 男朋友 有参无参构造器 set get方法
男孩类：年龄 姓名 有参无参构造器 set get方法
测试类中：
```java
 public static void main(String[] args) {
        // 男孩
        Boy b = new Boy();
        b.setAge(27);
        b.setName("小刚");
        // 女孩
        Girl g = new Girl();
        g.setAge(25);
        g.setName("丽丽");
        g.setBoyfriend(b);

        // 业务-打印
        System.out.println("女孩" + g.getName() + "和男孩" + g.getBoyfriend().getName() + "在谈恋爱");
    }
```
## 5.spring属性注入方式
设置属性的值：
①value：简单数据类型直接设置
②ref：需要引用另一个bean的id，也就是说这个参数是一个类类型，且这个类的对象也被spring容器管理
配置文件中
```java
    <bean id = "boy" class = "com.msb.pojo.Boy">
        <property name="age" value="22"></property>
        <property name="name" value="小明"></property>
    </bean>
    
    <bean id = "girl" class = "com.msb.pojo.Girl">
        <property name="age" value="19"></property>
        <property name="name" value="露露"></property>
        <property name="boyfriend" ref="boy"></property>
    </bean>
```
测试类中
```java
public class Test3 {
    public static void main(String[] args) {
        // 创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取对象
        Girl g = (Girl)context.getBean("girl");
        // 打印对象的信息
        System.out.println("女孩名字:"+g.getName()+",女孩的男朋友的名字是："+g.getBoyfriend().getName());
    }
}
```
## 6.IOC/DI相关的注解（作用都是创建对象）
Component:实例化Bean，默认名称为类名称首字母小写，无需指定set方法
⭐在要创建对象的类中加入此注解
⭐需要将注解所在的包进行扫描，在配置文件中添加context命名空间
```java
xmlns:context="http://www.springframework.org/schema/context"
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context.xsd">
    
    <context:component-scan base-package="com.msb.pojo"></context:component-scan>
```
```java
public class Test3 {
    public static void main(String[] args) {
        // 创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取对象
        Girl g = (Girl)context.getBean("girl");
        System.out.println(g.getAge());
        System.out.println(g.getName());
        System.out.println(g.getBoyfriend());
    }
}
```
Repository:用在持久层
Service:用在业务层
Controller:用在控制器层
Configuration:用在配置类上
Autowired:会把容器中的对象自动注入进来，并且不需要依赖set方法
Value:给普通数据类型属性赋值(八种基本数据类型+String)
## 7.案列--查询书籍
①建数据库表对应的实体类
②先建mapper层---→建mapper接口---→接口中写抽象方法---→mapper的xml文件
```java
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.msb.mapper.BookMapper">
    <!--id是方法名字  resultType是实体类的路径-->
    <select id="selectAll" resultType="com.msb.pojo.Book">
        select * from t_book
    </select>
</mapper>
```
③再建Service层---→建Service接口---→接口中写抽象方法---→建Service实体类，实现接口并重写接口中的方法(注入mapper对象并调用方法 )
```java
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List findAll() {
        return bookMapper.selectAll();
    }
}
```
④建Controller层---→建Controller类---→类中写方法---→注入Service对象并调用方法
```java
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/findAllBooks",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String findAll() {
        List list = bookService.findAll();
        System.out.println(list.size());
        //  定义一个字符串用来接收响应的字符串
        String books = "";
        for (int i = 0; i < list.size(); i++) {
            Book book = (Book) list.get(i);
            books = books + book.getName();
            books = books + book.getAuthor();
        }
        return books;
    }
}
```

