package com.company.oop;

public class EqualsTest {
    public static void main(String[] args) {
        Student s1 = new Student("JYL");
        Student s2 = new Student("JYL");

        System.out.println(s1.equals(s2));
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Student) {
            Student stu = (Student) obj;
            return this.name.equals(stu.name);
        }

        return false;
    }
}