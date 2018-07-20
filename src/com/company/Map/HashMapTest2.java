package com.company.Map;

import java.util.HashMap;

public class HashMapTest2 {

    public static void main(String[] args) {
        args = new String[4];

        args[0] = "Hello";
        args[1] = "World";
        args[2] = "Hello";
        args[3] = "Welcome";

        HashMap map = new HashMap();

        for (String str: args) {
            if (! map.containsKey(str)) {
                map.put(str, new Integer(1));
            } else {
                Integer integer = (Integer) map.get(str);
                map.put(str, new Integer(integer.intValue() + 1));
            }
        }

        System.out.println(map);
    }
}
