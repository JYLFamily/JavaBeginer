package com.company.oop;

public class ThisTest {
    public static void main(String[] args) {
        T t = new T();
        t.run1();
        t.run2();
    }
}


class T {
    public void run1() {
        System.out.println("run1");
    }
    public void run2() {
        this.run1();
        System.out.println("run2");
    }
}