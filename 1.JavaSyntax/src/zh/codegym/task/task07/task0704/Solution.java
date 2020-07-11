package zh.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
翻转数组
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];

        for (int i = 9; i >= 0; i--) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        for (int n : num)
            System.out.println(n);
    }
}

