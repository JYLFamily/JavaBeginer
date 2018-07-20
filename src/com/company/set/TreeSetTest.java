package com.company.set;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet set = new TreeSet(new MyComparator());

        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set);

    }
}

class MyComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;

        return - s1.compareTo(s2);
    }
}
