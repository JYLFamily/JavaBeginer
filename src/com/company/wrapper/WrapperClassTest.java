package com.company.wrapper;

public class WrapperClassTest {

    public static void main(String[] args) {
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer("1");

        System.out.println(integer1.intValue());
        System.out.println(integer2.intValue());
    }
}
