package zh.codegym.task.task08.task0818;

import java.util.*;

/* 
只针对富人
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= 10; i++)
            map.put("name" + i, i * 100);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500)
                list.add(pair.getKey());    // 将薪水小于 500 的添加到集合
        }

        for (String s : list)
            map.remove(s);
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = createMap();
//
//        removeItemFromMap(map);
//
//        for (Map.Entry<String, Integer> pair : map.entrySet())
//            System.out.println(pair.getKey() + " : " + pair.getValue());
    }
}