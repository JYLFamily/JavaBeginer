package com.company.array;

/**
 * Created by puhui on 2018/7/14.
 */
public class ArrayTest5 {


    public static void main(String[] args) {
        // 接口是不能 new 的，这里并不是生成接口
        // 对象而是生成接口引用
        I[] i1 = new I[2];
        // 如下生成接口引用并没有生成接口对象也不
        // 会报错
        I i2 = null;


    }
}

interface I {

}