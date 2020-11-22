package zh.codegym.task.task19.task1919;

/* 
计算薪水
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] split = line.split(" ");
            String name = split[0];
            double salary = Double.valueOf(split[1]);
            if (map.containsKey(name))
                map.put(name, salary + map.get(name));
            else
                map.put(name, salary);
        }
        reader.close();

        Set set = map.keySet();
        Object[] arr = set.toArray();
        Arrays.sort(arr);
        for (Object key : arr) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
