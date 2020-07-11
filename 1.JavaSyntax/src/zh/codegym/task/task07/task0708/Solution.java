package zh.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
最长的字符串
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>(); // 将现有字符串字段初始化位新的 ArrayList<>

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int max_length = 0;
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
            if (s.length() > max_length)
                max_length = s.length();
        }
        /**
         * 读取五个字符串，并写入字符串列表
         * 求出最长字符串的长度
         */

        for (String s : strings) {

        } // 求出最长字符串的长度

        for (String s: strings) {
            if (s.length() == max_length)
                System.out.println(s);
        } // 如果有多个最长字符串，则每行显示一个

    }
}
