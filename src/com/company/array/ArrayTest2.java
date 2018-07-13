package com.company.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[100];

        for (int i = 0; i < students.length; i++) {
            // 偶数 zhangsan 奇数 lisi
//            if (i % 2 == 0) {
//                students[i] = new Student("zhangsan");
//            }
//            else {
//                students[i] = new Student("lisi");
//            }

            // 满足条件 zhangsan 不满足条件 lisi
            students[i] = i % 2 == 0 ? new Student("zhangsan") : new Student("lisi");
        }

        for (Student student: students) {
            System.out.println(student.name);
        }
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}
