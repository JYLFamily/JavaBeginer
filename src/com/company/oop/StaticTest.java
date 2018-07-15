package com.company.oop;

/**
 * Created by puhui on 2018/7/7.
 */
public class StaticTest {

    public static void main(String[] args) {
        MyStatic myStatic =  new MyStatic();
        System.out.println(MyStatic.a);  // 能够使用类名使用
        System.out.println(myStatic.a);
        MyStatic.runClassMethod();
        myStatic.runClassMethod();

        /***
         * 静态方法会被继承，如果子类中存在名称、参数列表与
         * 父类相同的静态方法，父类的静态方法会被隐藏。此时
         * 使用父类型的引用调用父类的静态方法，使用子类型的
         * 引用调用子类的静态方法。
         */
        MyStaticBaseClass myStaticBaseClass =  new MyStatic();
        MyStaticBaseClass.runClassMethod();
        myStaticBaseClass.runClassMethod();
    }
}

class MyStaticBaseClass {
    public void runInstanceMethod() {
        System.out.println("This is in MyStaticBaseClass run method !");
    }
    public static void runClassMethod() {
        System.out.println("This is in MyStaticBaseClass static run method !");
    }
}

class MyStatic extends MyStaticBaseClass {
    // 静态成员变量
    static int a;

    public void runInstanceMethod() {
        // static 只能修饰成员变量，不能修饰局部变量
        // static int a = 0;
        System.out.println("This is in MyStatic run method !");
    }
    public static void runClassMethod() {
        System.out.println("This is in MyStatic static run method !");
    }
}
