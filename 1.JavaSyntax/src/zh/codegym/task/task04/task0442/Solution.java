package zh.codegym.task.task04.task0442;


/* 
相加
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, number;

        while (true) {
            number = Integer.parseInt(reader.readLine());
            sum += number;
            if (number == -1)
                break;
        }

        System.out.println(sum);
    }
}
