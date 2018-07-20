package com.company.Map;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("A", "aa");
        map.put("B", "bb");
        map.put("C", "cc");
        map.put("D", "dd");

        System.out.println(map.get("A"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("------------------------------------");



        for (Iterator iter = map.keySet().iterator(); iter.hasNext();) {
            String key = (String) iter.next();
            System.out.println((String) map.get(key));
        }
    }
}
