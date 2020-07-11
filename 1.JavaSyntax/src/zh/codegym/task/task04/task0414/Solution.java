package zh.codegym.task.task04.task0414;

/* 
这一年包含的天数
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);

        if (n % 400 == 0 || n % 100 != 0 && n % 4 == 0)
            System.out.println("这一年的天数：366");
        else
            System.out.println("这一年的天数：365");

    }
}