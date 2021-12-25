package zh.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
替换数字
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "零");
        map.put(1, "一");
        map.put(2, "二");
        map.put(3, "三");
        map.put(4, "四");
        map.put(5, "五");
        map.put(6, "六");
        map.put(7, "七");
        map.put(8, "八");
        map.put(9, "九");
        map.put(10, "十");
        map.put(11, "十一");
        map.put(12, "十二");
    }

    public static void main(String[] args) throws IOException {
        // 从控制台读取文件名，关闭控制台输入
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bf.readLine()));
//        BufferedReader reader = new BufferedReader(new FileReader("A:\\myjava\\1.txt"));
        bf.close();

        /**
         * 当 line 为空，说明文件读取完毕，则退出循环
         * 以空格分割每一个单词
         * 如果单词是数字则判断是否在 map 中有对应 key 有则替换
         */
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            String result = "";
            for (String word : words) {
                if (isNumber(word)) {
                    int key = Integer.parseInt(word);
                    if (map.containsKey(key))
                        result += map.get(key) + " ";
                    else
                        result += word + " ";
                }
                else
                    result += word + " ";
            }
            System.out.println(result);
        }

        reader.close();
    }

    private static boolean isNumber(String str) {
        if (str.equals(""))
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
}
