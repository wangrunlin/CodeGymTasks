package zh.codegym.task.task04.task0415;

/* 
三角形法则
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String as = reader.readLine();
        String bs = reader.readLine();
        String cs = reader.readLine();
        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);
        int c = Integer.parseInt(cs);

        if (isTriangle(a, b, c))
            System.out.println("三角形可能存在。");
        else
            System.out.println("三角形不可能存在。");
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        return true;
    }
}