package zh.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
人口普查
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            if (i < 5)
                map.put(convertUppercase(i), "柳");
            else
                map.put(convertUppercase(i), "袁");
        }

        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;

        for (String values : map.values()) {
            if (values.equals(name))
                count++;
        }

        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;

        for (String key : map.keySet()) {
            if (key.equals(lastName))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//
//        System.out.println(getSameFirstNameCount(map, "柳"));
//        System.out.println(getSameLastNameCount(map, "贰"));
    }

    private static String convertUppercase(int n) {
        String s = null;
        switch (n) {
            case 0 : s = "零"; break;
            case 1 : s = "壹"; break;
            case 2 : s = "贰"; break;
            case 3 : s = "叁"; break;
            case 4 : s = "肆"; break;
            case 5 : s = "伍"; break;
            case 6 : s = "陆"; break;
            case 7 : s = "柒"; break;
            case 8 : s = "捌"; break;
            case 9 : s = "玖"; break;
        }
        return s;
    }
}
