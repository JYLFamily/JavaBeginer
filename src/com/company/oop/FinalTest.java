package com.company.oop;

/**
 * Created by puhui on 2018/7/8.
 */
public class FinalTest {
    /***
     * 会报错，原因在于生成对象的时候先给属性赋值，再调
     * 用构造函数。故构造方法中修改属性 flag 的值
     */
//    final int flag = 0;
//
//    public FinalTest(int flag) {
//        this.flag = flag;
//    }

    public static void main(String[] args) {
//        FinalTest finalTest = new FinalTest(1);
    }
}
