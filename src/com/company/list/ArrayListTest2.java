package com.company.list;

import java.util.ArrayList;

/**
 * Created by puhui on 2018/7/15.
 */
public class ArrayListTest2 {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("Money");
        arrayList.add(new Integer(17));

        System.out.println(arrayList.get(0).getClass());
        System.out.println(arrayList.get(1).getClass());
    }
}
