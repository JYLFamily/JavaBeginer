package com.company.string;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer == buffer.append("Hello"));
        System.out.println(buffer == buffer.append(" World"));

        String str = new String("Hello");
        System.out.println(str == str + "_World");

    }
}
