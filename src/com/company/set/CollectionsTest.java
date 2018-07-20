package com.company.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(new Integer(10));
        list.add(new Integer(20));
        list.add(new Integer(30));
        list.add(new Integer(40));
        list.add(new Integer(15));

        for (Iterator iter = list.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}
