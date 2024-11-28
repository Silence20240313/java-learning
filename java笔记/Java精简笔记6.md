## 1.springboot项目搭建
①创建maven工程
②选择springboot的版本
pom文件中：
```java
<dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>2.7.6</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
    </dependencies>
</dependencyManagement>
```
③整合springmvc用到的包，添加启动器
（以前绝大多数xml配置文件）
pom文件中：
```java
<dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
      <version>2.7.6</version>
    </dependency>
</dependencies>
```
④开发一个Controller
```java
@Controller
public class MyController {
    @RequestMapping("/test01")
    @ResponseBody
    public String test01(){
        return "hi,springboot";
    }
}
```
⑤启动类编写
```java
@SpringBootApplication

public class TestSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestSpringBootApplication.class,args);
    }
}
```
⑥运行，浏览器访问测试
## 2.springboot配置文件
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/cea5139f-4bf9-3c27-3187-cfa8bfda18a8.png)
## 3.springboot版本--案例--书城
①导入依赖
```java
  <dependencies>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
      <version>2.7.6</version>
    </dependency>

    <dependency>
      <groupId>org.mybatis.spring.boot</groupId>
      <artifactId>mybatis-spring-boot-starter</artifactId>
      <version>2.1.3</version>
    </dependency>

    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.21</version>
    </dependency>

  </dependencies>
```
②编写配置文件
```java
server:
  port: 8888
  servlet:
    context-path: /springbootssm
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/wiki?useSSL=false&characterEncoding=utf8&serverTimezone=GMT%2B8
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: root
    password: root
```
③编写实体类，配置文件中加入别名
```java
mybatis:
  type-aliases-package: com.msb.pojo
```
④定义mapper接口
```java
public interface BookMapper {
     List selectAllBooks();
}
```
⑤定义mapper.xml映射文件(resources下mybatis包下BookMapper.xml文件)
```java
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.msb.mapper.BookMapper">
    <!--id是方法名字  resultType是实体类的路径-->
    <select id="selectAllBooks" resultType="com.msb.pojo.Book">
        select * from t_book
    </select>
</mapper>
```
⑥配置文件中加入映射文件位置
```java
mapper-locations: classpath: mybatis/*.xml
```
⑦定义启动类，在启动类中加入mapper的包扫描
```java
@SpringBootApplication
@MapperScan("com.msb.mapper")

public class TestSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestSpringBootApplication.class,args);
    }
}
```
⑧Service层接口及实现类
```java
public interface BookService {
    List findAllBooks();
}
```
⑨Service层实现类
```java
@Service

public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    public List findAllBooks() {
        return bookMapper.selectAllBooks();
    }
}
```
⑩Controller层
```java
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/findBooks")
    @ResponseBody
    public String findBooks(){
        List list = bookService.findAllBooks();
        String s = "";
        for (int i = 0; i < list.size(); i++) {
             Book b = (Book)list.get(i);
             s += b.getName();
             s += b.getAuthor();
        }
        return s;
    }
}
```
11.测试

