package zh.codegym.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/* 
包含对象的 HashMap
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("西姆", 5);
        map.put("汤姆", 5.5);
        map.put("阿勃斯", false);
        map.put("婴儿", null);
        map.put("猫", "猫");
        map.put("吃", new Long(56));
        map.put("食物", new Character('3'));
        map.put("万能激活卡", '6');
        map.put("拥抱", 111111111111L);
        map.put("康普", (double) 123);

        printMap(map);

    }

    public static void printMap(HashMap<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}
