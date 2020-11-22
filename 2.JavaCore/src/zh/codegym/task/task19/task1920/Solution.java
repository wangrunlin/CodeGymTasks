package zh.codegym.task.task19.task1920;

/* 
首富
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] split = line.split(" ");
            String key = split[0];
            double value = Double.valueOf(split[1]);
            if (map.containsKey(key))
                map.put(key, value + map.get(key));
            else
                map.put(key, value);
        }
        reader.close();

        double max = Collections.max(map.values());
        Set set = map.keySet();
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        for (Object key : arr) {
            if (map.get(key) == max)
                System.out.println(key);
        }

    }
}
