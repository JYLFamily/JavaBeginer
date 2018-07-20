package com.company.list;

import java.util.LinkedList;
import java.util.ArrayList;

public class ListTest {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        ArrayList arrayList2 = new ArrayList(linkedList);
        LinkedList linkedList2 = new LinkedList(arrayList);
    }
}
