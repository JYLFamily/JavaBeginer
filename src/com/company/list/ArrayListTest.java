package com.company.list;

import java.util.ArrayList;
/**
 * Created by puhui on 2018/7/14.
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("Hello");
        arrayList.add("Hello");
        arrayList.add("World");

        System.out.println(arrayList.get(0).getClass());
        System.out.println(arrayList.get(1).getClass());
        System.out.println("------------------------");
        System.out.println((String) arrayList.get(0));
        System.out.println((String) arrayList.get(1));
        System.out.println("------------------------");
//        arrayList.clear();
//        System.out.println(arrayList.size());
//        System.out.println(arrayList.isEmpty());
        arrayList.remove("Hello");
        System.out.println(arrayList.size());
    }
}
