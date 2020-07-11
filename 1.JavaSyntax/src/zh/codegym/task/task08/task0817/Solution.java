package zh.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
我们不需要重复的内容
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Rose", "Derrick");
        map.put("James", "Derrick");
        map.put("Durant", "Kevin");
        map.put("Curry", "Stephen");
        map.put("Irving", "Kyrie");
        map.put("Tompson", "Klye");
        map.put("Johnson", "Joe");
        map.put("Young", "Nick");
        map.put("Lee", "David");
        map.put("Wall", "John");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, Integer> count = new HashMap<>();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String str = pair.getValue();

            if (count.containsKey(str))
                count.put(str, count.get(str) + 1);
            else
                count.put(str, 1);
        }

        for (Map.Entry<String, Integer> pair : count.entrySet()) {
            if (pair.getValue() >= 2)
                removeItemFromMapByValue(map, pair.getKey());
        }


//        Iterator<Map.Entry<String, String>> iteratorMap = map.entrySet().iterator();

//        while (iteratorMap.hasNext()) {
//            Map.Entry<String, String> pair = iteratorMap.next();
//
//            int count = 0;
//
//            String compare = pair.getValue();
//
//            for (String s : map.values()) {
//                if (s.equals(compare));
//                    count++;
//            }
//
//            if (count >= 2) {
//                removeItemFromMapByValue(map, pair.getValue());
//
//                iteratorMap = map.entrySet().iterator();    // 更新迭代器
//            }
//        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> hashMap = createMap();
//
//        removeFirstNameDuplicates(hashMap);
//
//        for (Map.Entry<String, String> entry : hashMap.entrySet())
//            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
