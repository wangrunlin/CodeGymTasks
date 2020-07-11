package zh.codegym.task.task05.task0530;

import java.io.*;

/* 
老板，发生了一件奇怪的事情
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("总和 = " + sum);
    }
}
