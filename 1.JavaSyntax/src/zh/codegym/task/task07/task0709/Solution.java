package zh.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
更简洁地表达自己
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        int min_length = 0;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
            if (i == 0) {
                min_length = s.length();
            } else if (s.length() < min_length) {
                min_length = s.length();
            }
        }

        for (String s : list) {
            if (s.length() == min_length)
                System.out.println(s);
        }
    }
}
