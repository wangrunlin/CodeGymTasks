package zh.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
十只猫
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            map.put(numCapital(i), new Cat("name" + i));
        }
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();

        for (Map.Entry<String, Cat> entry : map.entrySet()) {
            set.add(entry.getValue());
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }

    public static String numCapital(int n) {
        String result = null;
        switch (n) {
            case 0 : result = "零"; break;
            case 1 : result = "壹"; break;
            case 2 : result = "贰"; break;
            case 3 : result = "叁"; break;
            case 4 : result = "肆"; break;
            case 5 : result = "伍"; break;
            case 6 : result = "陆"; break;
            case 7 : result = "柒"; break;
            case 8 : result = "捌"; break;
            case 9 : result = "玖"; break;
            case 10 : result = "拾"; break;
        }
        return result;
    }
}
