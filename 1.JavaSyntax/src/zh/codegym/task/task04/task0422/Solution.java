package zh.codegym.task.task04.task0422;

/* 
18 岁以上
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18)
            System.out.printf("再长大一点\n");

    }
}
