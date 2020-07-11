package zh.codegym.task.task04.task0425;

/* 
目标已锁定！
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        System.out.println(Quadrant(a, b));

    }

    public static int Quadrant(int a, int b) {
        int n = 0;
        if (a > 0)
            n = b > 0 ? 1 : 4;
        else
            n = b > 0 ? 2 : 3;
        return n;
    }
}
