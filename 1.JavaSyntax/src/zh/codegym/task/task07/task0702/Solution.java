package zh.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
以相反顺序显示字符串数组
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str[] = new String[10];

        for (int i = 0; i < 8; i++) {
            str[i] = reader.readLine();
        }

        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println(str[i]);
        }
    }
}
