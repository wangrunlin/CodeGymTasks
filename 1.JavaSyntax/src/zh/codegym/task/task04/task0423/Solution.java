package zh.codegym.task.task04.task0423;

/* 
保安政策
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age > 20)
            System.out.println("18 岁就够大了");

    }
}
