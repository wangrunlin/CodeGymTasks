package zh.codegym.task.task08.task0801;

/* 
包含植物的 HashSet
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<String>();

        set.add("西瓜");
        set.add("香蕉");
        set.add("樱桃");
        set.add("梨");
        set.add("哈密瓜");
        set.add("黑莓");
        set.add("人参");
        set.add("草莓");
        set.add("鸢尾花");
        set.add("土豆");

        for (String s : set)
            System.out.println(s);
    }
}
