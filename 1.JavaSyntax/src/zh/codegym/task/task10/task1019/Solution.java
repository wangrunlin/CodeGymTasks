package zh.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
功能还不够！
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String input = reader.readLine();
            if (input.isEmpty()) break;
            int id = Integer.parseInt(input);
            map.put(null, id);
            String name = reader.readLine();
            if (name.isEmpty()) break;
            map.remove(null);
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getKey() == null)
                System.out.println(pair.getValue());
            else
                System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
