package zh.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
寂寞数组之间的互动
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[10];
        int[] length = new int[10];

        for (int i = 0; i < 10; i++) {
            str[i] = reader.readLine();
            length[i] = str[i].length();
        }

        for (int n : length)
            System.out.println(n);
    }
}
