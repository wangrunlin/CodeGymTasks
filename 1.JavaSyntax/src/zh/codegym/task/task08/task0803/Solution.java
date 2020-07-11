package zh.codegym.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
包含猫的 HashMap
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"泰格", "米西", "斯摩基", "果酱", "奥斯卡", "雪球", "博斯", "斯马奇", "马克斯", "辛巴"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        HashMap<String, Cat> map = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {
            map.put(cats[i], new Cat(cats[i]));
        }
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
