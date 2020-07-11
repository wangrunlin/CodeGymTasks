package zh.codegym.task.task04.task0429;

/* 
正数和负数
*/

import java.io.*;

public class Solution {

    public static int PLUS = 0, MINUS = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(reader.readLine());
            isPlusOrMinus(a);
        }
        System.out.println("负数个数：" + MINUS);
        System.out.println("正数个数：" + PLUS);
    }

    public static void isPlusOrMinus(int n) {
        if (n > 0)
            PLUS++;
        else if (n < 0)
            MINUS++;
    }
}
