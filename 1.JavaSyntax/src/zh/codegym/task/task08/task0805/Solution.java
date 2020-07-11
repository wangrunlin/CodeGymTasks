package zh.codegym.task.task08.task0805;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
在屏幕上显示值！
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("西姆", "西姆");
        map.put("汤姆", "汤姆");
        map.put("阿勃斯", "阿勃斯");
        map.put("婴儿", "婴儿");
        map.put("猫", "猫");
        map.put("狗", "狗");
        map.put("吃", "吃");
        map.put("食物", "食物");
        map.put("万能激活卡", "万能激活卡");
        map.put("拥抱", "拥抱");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext())
            System.out.println(((Map.Entry) iter.next()).getValue());
    }
}
