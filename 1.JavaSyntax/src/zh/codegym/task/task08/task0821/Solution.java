package zh.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
共享的姓氏和名字
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 2; i++) {
            map.put("name1", String.valueOf(i + 1));
            map.put("name2", String.valueOf(i));
            map.put("name3", String.valueOf(i));
            map.put("name1", String.valueOf(i + 2));
            map.put("name2", String.valueOf(i + 1));
        }

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
