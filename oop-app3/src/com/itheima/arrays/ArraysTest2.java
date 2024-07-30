package com.itheima.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest2 {
    public static void main(String[] args) {
    // TODO 对数组中的对象进行排序
        Student[]  students = new Student[4];
        students[0] = new  Student("蜘蛛精",169.5,23);
        students[1] = new  Student("紫霞",163.8,26);
        students[2] = new  Student("紫霞",163.8,26);
        students[3] = new  Student("至尊宝",167.5,24);

        // 1.对数组进行排序
        /*Arrays.sort(students);
        System.out.println(Arrays.toString(students));*/
        // [Student{name='蜘蛛精', height=169.5, age=23},
        // Student{name='至尊宝', height=167.5, age=24},
        // Student{name='紫霞', height=163.8, age=26},
        //  Student{name='紫霞', height=163.8, age=26}]

        // 2.参数一；需要排序的数组
        //   参数二：比较器对象（用来制定对象的比较规则）
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 制定比较规则  左边对象o1  右边对象02
                // 约定1：左边对象 大于 右边对象 请您返回正整数
                // 约定2：左边对象 小于 右边对象 请您返回负整数
                // 约定3：左边对象 等于 右边对象 请您返回0
               /* if (o1.getHeight() > o2.getHeight()){
                    return 1 ; 
                } else if (o1.getHeight() < o2.getHeight) {
                    return -1 ;
                }
                return 0;// 升序*/
                return Double.compare(o1.getHeight(),o2.getHeight());// 升序
                // return Double.compare(o2.getHeight(),o1.getHeight());// 降序
            }
        });
        System.out.println(Arrays.toString(students));
        //[Student{name='紫霞', height=163.8, age=26},
        // Student{name='紫霞', height=163.8, age=26},
        // Student{name='至尊宝', height=167.5, age=24},
        // Student{name='蜘蛛精', height=169.5, age=23}]
    }
}
