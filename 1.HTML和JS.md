##  HTML  

###  标题  
1.  标题排版  
※快捷键：  
    ①快速打出框架：！+回车  
    ②注释：ctrl+shift+/  
    ③保存：ctrl s   
    ④打开浏览器：alt+b         
![img_14.png](image/image5/img_14.png)   
![img_15.png](image/image5/img_15.png)   
网页标题在title处写，其他在body中写  
![img_39.png](image/image5/img_39.png)  
![img_38.png](image/image5/img_38.png)  

2.  标题样式  
![img_17.png](image/image5/img_17.png)   
![img_18.png](image/image5/img_18.png)  
![img_19.png](image/image5/img_19.png)  
![img_40.png](image/image5/img_40.png)  
![img_49.png](image/image5/img_49.png)  
CSS选择器：用来选取需要设置样式的元素  
<span>：比如设置字体颜色、大小、背景色等。  
![img_20.png](image/image5/img_20.png)  
![img_21.png](image/image5/img_21.png)  
![img_41.png](image/image5/img_41.png)  
id选择器：#id属性值{
             color；
             font-size:字体大小（xx px）
            }
3.  超链接  
![img_22.png](image/image5/img_22.png)  
![img_23.png](image/image5/img_23.png)  
![img_42.png](image/image5/img_42.png)  
self:在当前页面打开超链接  
blank:新页面打开超链接  
###  正文  
1.  正文排版  
![img_25.png](image/image5/img_25.png)   
![img_26.png](image/image5/img_26.png)  
![img_43.png](image/image5/img_43.png)  
2.  页面布局  
![img_27.png](image/image5/img_27.png)   
![img_28.png](image/image5/img_28.png)  
![img_44.png](image/image5/img_44.png)  
###  表格，表单标签  
1.  表格标签  
![img_29.png](image/image5/img_29.png)  
![img_30.png](image/image5/img_30.png)  
![img_45.png](image/image5/img_45.png)  
2.  表单标签  
![img_31.png](image/image5/img_31.png)  
![img_33.png](image/image5/img_33.png)  
![img_46.png](image/image5/img_46.png)  
type="submit" 是用于创建表单的提交按钮  
3.  表单项标签  
![img_36.png](image/image5/img_36.png)  
![img_37.png](image/image5/img_37.png)  
![img_47.png](image/image5/img_47.png)  
![img_48.png](image/image5/img_48.png)  




##  JS  
用来给网页添加交互功能，可以实现动态更新内容、表单验证、动画效果、  
数据处理、与服务器的通信等。使网页变得更为生动和互动，而不仅仅是静态显示内容。  
###  JS引入方式  
![img_50.png](image/image5/img_50.png)  
![img_51.png](image/image5/img_51.png)  
放在 script 标签中  
    
###  JS基础语法   
1.  书写语法  
![img_52.png](image/image5/img_52.png)  
![img_53.png](image/image5/img_53.png)  
写入警告框：alert(); 写入浏览器控制台：console.log();  
2.  变量  
![img_55.png](image/image5/img_55.png)   
![img_56.png](image/image5/img_56.png)  
var:声明变量  可以存放不同类型的值  可以重复定义  
3.  数据类型，运算符，流程控制语句  
![img_57.png](image/image5/img_57.png)  
![img_58.png](image/image5/img_58.png)  
![img_59.png](image/image5/img_59.png)  
![img_61.png](image/image5/img_61.png)  
![img_62.png](image/image5/img_62.png)  
typeof:可以获取数据类型  
运算符：==：会进行类型转换     ===：不会进行类型转换  
parseInt()函数的用法，主要用于将字符串转换为整数。  
类型转换：  
        ①数字转换为布尔类型：0和NaN为false,其他为true  
        ②字符串转换为布尔类型：空字符串为false,其他为true  
        ③null和undefined转换为布尔类型：均为false  

###  JS函数   
![img_63.png](image/image5/img_63.png)  
![img_65.png](image/image5/img_65.png)  
![img_66.png](image/image5/img_66.png)  
方法：  
通过function定义函数：     
function 方法名（形参）{     
        要执行的方法     
        }     
调用：方法名（实际参数）；    
需要返回使用return  

###  JS对象   
1.  Array  
![img_68.png](image/image5/img_68.png)  
![img_69.png](image/image5/img_69.png)  
![img_70.png](image/image5/img_70.png)  
![img_71.png](image/image5/img_71.png)  
for循环快捷键：输入fori后按下Tab键  
定义数组：数组长度可变，可以存储任意类型的数据    
var 变量名 = [ 元素列表 ];  
访问：  
arr[ 索引 ]= 值；  
方法：  
for:遍历数组  
![img_100.png](image/image5/img_100.png)  
forEach:遍历数组中有值的元素  
![img_101.png](image/image5/img_101.png)  
push:添加元素到数组末尾  
splice:删除元素，从哪个索引开始删，删几个元素  
2.  String  
![img_72.png](image/image5/img_72.png)  
![img_73.png](image/image5/img_73.png)  
方法：  
①charAt:获取指定位置的字符  
②indexOf:检查字符串，返回索引值    
③trim:去除字符串左右两侧的空格  
④substring:提取字符串中两个指定的索引号之间的字符。开始索引，结束索引，含头不含尾  
3.  JSON  
![img_75.png](image/image5/img_75.png)  
![img_76.png](image/image5/img_76.png)  
![img_77.png](image/image5/img_77.png)  
![img_78.png](image/image5/img_78.png)  
![img_79.png](image/image5/img_79.png)  
自定义格式：  
![img_102.png](image/image5/img_102.png)  
调用：  
对象名.属性名；  对象名.方法名()；  
JSON定义：  
var 变量名 = '{"key1": value1,"key2":value2,"key3":value3}';   
JSON字符串转为对象：var arr = JSON.parse(变量名);  
对象转为JSON字符串:var str = JSON.stringfy(arr);  
4.  BOM  
![img_80.png](image/image5/img_80.png)  
![img_81.png](image/image5/img_81.png)  
![img_82.png](image/image5/img_82.png)  
![img_83.png](image/image5/img_83.png)  
window方法：  
①confirm:对话框  确认- true    取消- false  
confirm("确定要删除吗？");  
![img_103.png](image/image5/img_103.png)  
②setInterval:定时器 周期性的（每间隔多长时间）执行某一个方法  
![img_104.png](image/image5/img_104.png)  
③setTimeout:定时器 延迟指定时间执行一次  
![img_105.png](image/image5/img_105.png)  
location方法：跳转到指定的路径  
![img_106.png](image/image5/img_106.png)  
5.  DOM  
![img_85.png](image/image5/img_85.png)  
![img_86.png](image/image5/img_86.png)  
![img_87.png](image/image5/img_87.png)  
![img_88.png](image/image5/img_88.png)  
![img_89.png](image/image5/img_89.png)  
![img_90.png](image/image5/img_90.png)  
![img_91.png](image/image5/img_91.png)  
![img_92.png](image/image5/img_92.png)  
innerHTML：更改内容  
TagName:标签名  
ByName:属性名  
checked=true的话 选中复选框  
toLowerCase:变成小写  
toUpperCase：变成大写  
###  JS事件监听  
1.  事件绑定   
![img_93.png](image/image5/img_93.png)  
![img_94.png](image/image5/img_94.png)  
绑定事件两种方式：  
①直接在HTML标签中使用 onclick 属性绑定事件  
onclick="on()" 表示当这个按钮被点击时，将执行名为 on() 的方法  
②通过 document.getElementById() 动态地为按钮绑定事件  
当事件绑定2按钮被点击时，会执行这个匿名函数，并弹出一个警告框，显示“按钮2被点击了”。  
    document.getElementById('btn2').onclick = function(){  
    alert("按钮2被点击了");  
    }  
2.  常见事件  
![img_95.png](image/image5/img_95.png)  
3.  案例  
![img_96.png](image/image5/img_96.png)  
![img_97.png](image/image5/img_97.png)  
![img_98.png](image/image5/img_98.png)  
![img_99.png](image/image5/img_99.png)  
输入框聚焦时将输入内容转换为小写，失去焦点时转换为大写  
聚焦：onfocus事件   失去焦点：onblur事件  
小写：toLowerCase()函数   大写：toUpperCase()函数  、
多选框：全选中状态：checked = true  全不选状态：checked = false  


 


  

 
  


  

  






















