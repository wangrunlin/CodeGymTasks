package zh.codegym.task.task04.task0428;

/* 
正数
*/

import java.io.*;

public class Solution {
    public static int COUNT = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            isPositiveNumber(a);
        }
        System.out.println(COUNT);

    }

    public static void  isPositiveNumber(int n) {
        if (n > 0)
            COUNT++;
    }
}
