package com.company.set;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        for (Iterator iter2 = set.iterator(); iter2.hasNext();) {
            System.out.println(iter2.next());
            iter2.remove();
        }
    }
}
