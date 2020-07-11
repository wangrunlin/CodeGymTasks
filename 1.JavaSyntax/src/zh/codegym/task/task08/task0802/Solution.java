package zh.codegym.task.task08.task0802;

/* 
包含 10 个对的 HashMap
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("西瓜", "瓜");
        map.put("香蕉", "水果");
        map.put("樱桃", "水果");
        map.put("梨", "水果");
        map.put("哈密瓜", "瓜");
        map.put("黑莓", "水果");
        map.put("人参", "根");
        map.put("草莓", "水果");
        map.put("鸢尾花", "花");
        map.put("土豆", "块茎");

        for (Map.Entry<String, String> pair : map.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

    }
}
