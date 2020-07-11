package zh.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
检查顺序
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        int min_length = 0;
        for (int i = 0; i < 10; i++) {
//            String s = reader.readLine();
//
//            if (i == 0 || s.length() < min_length)
//                min_length = s.length();

            list.add(reader.readLine());
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < list.get(i - 1).length()) {
                System.out.println(i);
                break;
            }
        }
    }
}

