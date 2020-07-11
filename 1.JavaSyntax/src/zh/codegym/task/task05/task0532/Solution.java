package zh.codegym.task.task05.task0532;

import java.io.*;

/* 
有关算法的任务
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        if (n > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int i = 1; i < n; i++) {
                int temp = Integer.parseInt(reader.readLine());
                maximum = Math.max(maximum, temp);
            }
            System.out.println(maximum);
        }
        reader.close();
    }
}
