package com.company.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by puhui on 2018/7/22.
 */
public class GenericTest5 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "aa");
        map.put("b", "bb");
        map.put("c", "cc");

        // Set 里面每个元素都是 Map.Entry<String, String> 类型
        // String String 分别代表 Key 与 Value 是 String 类型
        Set<Map.Entry<String, String>> entry = map.entrySet();

        for (Iterator<Map.Entry<String, String>> iter = entry.iterator(); iter.hasNext();) {
            Map.Entry<String, String> map2 = iter.next();
            String key = map2.getKey();
            String value = map2.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
