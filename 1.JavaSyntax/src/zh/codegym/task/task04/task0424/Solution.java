package zh.codegym.task.task04.task0424;

/* 
三个数字
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(function(a, b, c));

    }

    public static int function(int a, int b, int c) {
        int n = 0;
        if (a != b && b == c)
            n =  1;
        else if (b != a && a == c)
            n = 2;
        else if (c != a && a == b)
            n = 3;
        return n;
    }
}
