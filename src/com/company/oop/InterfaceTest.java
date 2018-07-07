package com.company.oop;

public class InterfaceTest {

    public static void main(String[] args) {
        /**
         * 当继承一个父类、实现多个接口的时候，可以使用父类
         * 或者任意一个接口作为引用的类型。但是注意使用哪个
         * 引用的类型引用只能调用相应父类或接口中存在的方法
         *
         * 只有 Test 类型的引用才能调用 Test 类中实现的方
         * 法
         */

        // 向上类型转换
        MainInterface1 testMI1 = new Test();
        testMI1.output1();
        // 向下类型转换
	    Test test1 = (Test) testMI1;

        MainInterface2 testMI2 = new Test();
        testMI2.output2();
        Test test2 = (Test) testMI2;

        MainClass testMC = new Test();
        testMC.output3();
        Test test3 = (Test) testMC;

        Test test = new Test();
        test.output();
    }
}

interface MainInterface1 {
    public void output1();
}

interface MainInterface2 {
    public void output2();
}

abstract class MainClass {
    public abstract void output3();
}


class Test extends MainClass implements MainInterface1, MainInterface2 {
    public void output1() {
        System.out.println("Implements MainInterface1");
    }

    public void output2() {
        System.out.println("Implements MainInterface2");
    }

    public void output3() {
        System.out.println("Extends MainClass");
    }

    public void output() {
        System.out.println("Extends MainClass");
    }
}