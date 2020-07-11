package zh.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
元音和辅音
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] string = reader.readLine().toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length; i++) {
            if (string[i] != ' ')
                if (isVowel(string[i]))
                    System.out.print(string[i] + " ");
                else
                    list.add(string[i]);
        }

        System.out.println();
        for (char c : list)
            System.out.print(c + " ");

    }

    // 该方法检查字母是否为元音
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // 转换为小写

        for (char d : vowels)   // 在数组中查找元音
        {
            if (c == d)
                return true;
        }
        return false;
    }
}