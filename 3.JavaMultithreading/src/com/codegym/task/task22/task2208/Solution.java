package com.codegym.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Build a WHERE query

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Johnson");
        map.put("country", "United States");
        map.put("city", "Los Angeles");
        map.put("age", null);

        System.out.println(getQuery(map));
        System.out.println(getQuery(null));
    }
    public static String getQuery(Map<String, String> params) {
        if (params == null) return "";
        StringBuilder sb = new StringBuilder();

        params.forEach((k, v) -> {
            if (v != null) {
                sb.append(String.format("%s = '%s' and ", k, v));
            }
        });

        String result = "";
        if (sb.length() > 0) {
            result = sb.substring(0, sb.lastIndexOf(" and"));
        }
        return result;
    }
}
