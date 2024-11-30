# 一：项目初始配置
### 1.Demo项目介绍
⭐项目框架：
①SpringBoot:几分钟内就搭好一个可以运行的项目
②Mybatis:用于对数据库的访问（持久层的框架）
③Devtools:部署工具，每次改代码不需要重启，idea会自动重启
（pom文件：添加依赖）



⭐分层结构（6层）：
①Config层:存放SpringBoot相关的配置类，包括启动类
启动类注解：
@SpringBootApplication
@ComponentScan（“com”） 扫描，放在com下的类全部交给Spring管理
@MapperScan("com.imooc.demo.mapper")   Mybatis扫描的包
②Controller层:所有请求的入口，前后端交互的入口
注解：@RequestMapping("/login") 前端通过这个注解进到程序中来
③Service层:负责所有的业务逻辑
负责Domain 与 Dto的转换
④Mapper层：负责java和数据库交互（包括interface（java的接口层）和xml（写sql语句）两类文件）
⑤Domain层：用一个java类来映射数据库表，类名就相当于表名，类的属性就相当于表的字段
⑥Dto层:数据传输对象，用于前后端数据交互（实体类）
和表并不完全一致，可以适当增加减少。 用在Controller和Service层



⭐application.properties文件配置：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/52d57d35-2c4a-50e3-765b-7f7e18cada39.png)



⭐gitignore:不需要交给git管理的文件放在这里


### 2.常用的基本设置
编码改为UTF-8:
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/3b25731b-d100-f590-36b0-4586109374ce.png)
jdk设置：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/be0916c8-bb0b-4ee1-61be-b3990c50d827.png)
关联import 自动导入
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/a3c4430b-529d-cd51-c085-297a360cfdbd.png)
### 3.编辑区设置
代码自动换行：
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/7f9fcf7a-e07b-11e7-7016-29fa5d0538a4.png)

# 二：开发中必会的技能
### 1.高效的代码编辑技能
⭐格式化代码：Ctrl+Alt+L
⭐复制：Ctrl+D
⭐上下移动一行或多行：Alt+Shift+⬇/⬆
### 2.快速跳转
⭐跳到指定行：Ctrl+G
⭐tabs快速切换：Alt+左箭头/右箭头
⭐查看浏览过的文件：Ctrl+E
⭐打开文件/类所在文件夹：Show In Explorer
(项目路径不要带中文)
### 3.快速查找和替换
⭐查找内容：Ctrl+F  全局查找：Ctrl+Shift+F
⭐替换内容：Ctrl+R  全局替换：Ctrl+Shift+R
⭐按文件名查找文件：Ctrl+Shift+N
⭐查找所有的菜单或操作：Ctrl+Shift+A
⭐万能查找：查找文件，菜单，操作（不能查找文件内容）：连按两次Shift
### 4.万能快捷键 Alt+Enter
⭐见到红色报错就按这个快捷键
⭐见到波浪线警告就按这个快捷键
⭐没报错没警告也可以按
### 5.键盘鼠标的配合
⭐纵向选择多列：按住Alt键不放，鼠标点击拖动
⭐选中一大段代码：鼠标点击开始位置，找到尾行的位置，按住Shift+鼠标点击结尾位置
⭐快速移动复制代码：用【选中一大段代码】的方法，要选择到最上一行的结尾，光标定位到目标位置的上一行结尾，粘贴
⭐类或方法的跳转：Ctrl+鼠标左键
# 三：运行与调试
自动编译：  
![image.png](https://qiita-image-store.s3.ap-northeast-1.amazonaws.com/0/3899383/47eb1cce-0c28-4b94-d6b9-3497d1431ab1.png)
# 四：高级进阶
### 1.代码生成Generate
生成set/get，构造函数，toString:Alt+Insert
### 2.代码重构Refactor
⭐重命名(局部变量，方法)：Shift+F6
⭐自动生成返回值：Ctrl+Alt+V
⭐移动文件位置：F6
⭐撤销上一步操作：Ctrl+Z
⭐文件复制:F5
⭐文件删除：Alt+delete
# 五：常用插件
集成git插件
①本地开发环境相关的文件不要提交。包括build,target,class等编译后生成的文件夹和文件
②新建项目时，README文件和.gitignore文件都不要




