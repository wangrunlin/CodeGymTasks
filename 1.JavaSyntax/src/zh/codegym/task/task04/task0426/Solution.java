package zh.codegym.task.task04.task0426;

/* 
标签和数字
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            if (n % 2 == 0)
                System.out.println("正偶数");
            else
                System.out.println("正奇数");
        } else if (n < 0) {
            if (n % 2 == 0)
                System.out.println("负偶数");
            else
                System.out.println("负奇数");
        } else
            System.out.println("零");

    }
}
