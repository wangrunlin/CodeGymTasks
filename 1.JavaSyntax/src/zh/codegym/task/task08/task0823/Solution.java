package zh.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
走向全国
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] ch = s.toCharArray();

        ch[0] = Character.toUpperCase(ch[0]);
        for (int i = 0; i < ch.length - 1; i++) {
            if (Character.isLetter(ch[i + 1]) && ch[i] == ' ')
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
        }

        System.out.println(new String(ch));
    }
}
