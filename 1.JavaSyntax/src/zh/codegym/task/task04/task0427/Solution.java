package zh.codegym.task.task04.task0427;

/* 
描述数字
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n >= 1 && n <= 999) {
            if (n < 10) {
                if (n % 2 == 0)
                    System.out.println("一位偶数");
                else
                    System.out.println("一位奇数");
            }
            else if (n < 100) {
                if (n % 2 == 0)
                    System.out.println("两位偶数");
                else
                    System.out.println("两位奇数");
            }
            else {
                if (n % 2 == 0)
                    System.out.println("三位偶数");
                else
                    System.out.println("三位奇数");
            }
        }

    }
}
