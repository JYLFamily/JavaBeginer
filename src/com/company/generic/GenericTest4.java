package com.company.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by puhui on 2018/7/22.
 */
public class GenericTest4 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}


