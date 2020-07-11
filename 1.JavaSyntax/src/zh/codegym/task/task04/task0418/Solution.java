package zh.codegym.task.task04.task0418;

/* 
两个数字中的最小值
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        String y = reader.readLine();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        System.out.println(a < b ? a : b);

    }
}