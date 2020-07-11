package zh.codegym.task.task04.task0416;

/* 
蒙眼过马路
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        float n = Float.parseFloat(s);
        if (n >= 0 && n <= 60)
            n %= 5;
        if (n >= 0 && n < 3)
            System.out.println("绿色");
        else if (n >= 3 && n < 4)
            System.out.println("黄色");
        else
            System.out.println("红色");
    }
}