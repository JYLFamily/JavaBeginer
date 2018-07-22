package com.company.generic;

/**
 * Created by puhui on 2018/7/22.
 */
public class GenericTest<T> {

    private T member;

    public void setMember(T member) {
        this.member = member;
    }

    public T getMember() {
        return member;
    }

    public static void main(String[] args) {
        GenericTest<Boolean> genericTest1 = new GenericTest<>();
        GenericTest<Integer> genericTest2 = new GenericTest<>();
        // 如果不使用变量类型参数化，即 T 为 Object
        GenericTest genericTest3 = new GenericTest();

        genericTest1.setMember(new Boolean(true));
        genericTest2.setMember(new Integer(1));

        // 如下为什么没有警告
        // genericTest1 = genericTest2;
    }
}
