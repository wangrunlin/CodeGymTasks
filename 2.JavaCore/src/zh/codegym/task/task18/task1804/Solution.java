package zh.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
最少的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        while (inputStream.available() > 0) {
            int temp = inputStream.read();
            if (map.containsKey(temp))
                map.put(temp, map.get(temp) + 1);
            else
                map.put(temp, 1);
        }
        inputStream.close();

        int min_byte = Collections.min(map.values());

        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() == Integer.valueOf(min_byte))
                System.out.print(entry.getKey() + " ");
        }
    }
}
