package zh.codegym.task.task18.task1821;

/* 
符号频率
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        FileInputStream inputStream = new FileInputStream(file);
        byte[] input = new byte[inputStream. available()];
        inputStream.read(input);
        inputStream.close();

        String str = new String(input);

        HashMap<Character, Integer> map = new HashMap<>();

        // 计算频率
        for (int i = 0; i < str.length(); i++) {
            char var = str.charAt(i);
            if (map.containsKey(var))
                map.put(var, map.get(var) + 1);
            else
                map.put(var, 1);
        }

        Set<Character> set = map.keySet();
        List<Character> list = new ArrayList<>(set);
        Collections.sort(list);

        for (Character ch : list) {
            System.out.println(ch + " " + map.get(ch));
        }
    }
}
