package zh.codegym.task.task04.task0419;

/* 
四个数字中的最大值
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int n[] = new int[10];
        for (int i = 0; i < 4; i++)
            str[i] = reader.readLine();
        for (int i = 0; i < 4; i++) {
            n[i] = Integer.parseInt(str[i]);
        }
        System.out.println(max(max(n[0], n[1]), max(n[2], n[3])));
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }
}






