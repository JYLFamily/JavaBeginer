package com.company.list;

import java.util.ArrayList;

/**
 * Created by puhui on 2018/7/15.
 */
public class ArrayListTest3 {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(new Integer(1));
        arrayList.add(new Integer(9));
        arrayList.add(new Integer(9));
        arrayList.add(new Integer(2));


        Integer i = null;
        int sum = 0;
        for (Object o : arrayList) {
            i = (Integer) o;
            sum = sum + i.intValue();
        }
        System.out.println(sum);
    }
}
