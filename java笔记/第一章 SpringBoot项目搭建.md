## 创建SpringBoot项目
#### 1.创建方法：
官网：https://start.spring.io/
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/d610408c-24c4-dfab-3761-c7e5cc449a9f.png)
点击完成后会自动下载一个压缩包→解压→用IDEA打开即可。
注意：SpringBoot不需要配置容器，使用了嵌入式容器，默认使用tomcat启动，默认端口8080。（容器：用于启动java web项目）
#### 2.项目初始配置：
⭐编码配置：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/8f7fbccd-6cb9-6ae8-db20-ae874a61597b.png)
⭐JDK配置：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/ccf2274c-4ff9-f317-2177-f60a4c43b3eb.png)
⭐Maven配置：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/bd4152dc-e071-0f20-3963-3b3c9dc14725.png)
⭐Git配置：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/06f80e1a-cb3d-9217-c918-02d3172c0f0c.png)
#### 3.开发Hello World接口
⭐注解：
①ResponseBody:用于声明返回文本数据，一般返回JSON
②RestController：Controller层的注解（Controller层用于定义接口，是请求的入口）
③RequestMapping：要让方法变成一个接口（支持所有的请求方式）
常见的http请求方式：get查询 post新增 put修改 delete删除
④ComponentScan：配置要交给Spring管理的类路径
SpringBootApplication注解包含了ComponentScan注解
如果启动类和其它类所在的包没有包含关系的话，需要加ComponentScan注解
注意：扫描的路径不要太通用，比如扫描"com.jiawa"，而不是"com"（会把第三方jar里的类也扫描出来）
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/a47a2a98-2fc7-c678-c3ac-d61972449793.png)
注意：config层用于放配置类
#### 4.自定义配置项
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/ca29094f-bd24-526d-2c74-1953deef8c8e.png)
#### 5.集成热部署
①在pom文件中添加依赖
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/2216c08b-100e-ad77-4a8f-58d0a8189f69.png)
②
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/83d18e68-7828-cae8-a2ad-e8f2f71b8fd5.png)
③
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/b3d254bb-fad8-1d00-1954-8127dfc9c83e.png)




