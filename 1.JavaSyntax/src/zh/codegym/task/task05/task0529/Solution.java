package zh.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
基于控制台的存钱罐
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("总和"))
                break;
            int n = Integer.parseInt(s);
            sum += n;
        }
        System.out.println(sum);
    }
}
