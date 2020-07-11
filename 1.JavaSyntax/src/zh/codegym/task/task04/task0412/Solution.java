package zh.codegym.task.task04.task0412;

/* 
正数和负数
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        if (n > 0)
            System.out.println(n * 2);
        else if (n < 0)
            System.out.println(n + 1);
        else
            System.out.println(0);

    }

}