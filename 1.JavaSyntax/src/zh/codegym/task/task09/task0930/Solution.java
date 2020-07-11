package zh.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
有关算法的任务
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));

//        /** 方法三 参考
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                String si = array[i], sj = array[j];
                if (isNumber(si) && isNumber(sj) && Integer.parseInt(si) < Integer.parseInt(sj)) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } else if (!isNumber(si) && !isNumber(sj) && isGreaterThan(si, sj)) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        /** 方法二
        for (int i = 0; i < array.length; i++) {
            String temp = "";
            if (isNumber(array[i])) {
                // 如果字符串是数字
                for (int j = 0; j < list.size(); j++) {
                    if (j == 0)
                        temp = list.get(j);
                    if (isNumber(list.get(j)) && isNumber(temp))
                        if (Integer.parseInt(temp) < Integer.parseInt(list.get(j)))
                            temp = list.get(j);
                }   // 查找列表中最大数字存入 temp 变量中
            } else {
                // 如果字符串不是数字
                for (int j = 0; j < list.size(); j++) {
                    if (j == 0)
                        temp = list.get(j);
                    if (!(isNumber(list.get(j))) && !(isNumber(temp)) && isGreaterThan(temp, list.get(j)))
                        temp = list.get(j);
                }   // 查找列表中最小字符串存入 temp 变量中
            }
            array[i] = temp;
            list.remove(temp);
        }
         */
        /** 方法一
        for (int i = 0; i < array.length; i++) {
            String temp = list.get(0);
            for (int j = 0; j < list.size(); j++) {
//                if (j != 0)
//                    temp = list.get(j);
                if (isNumber(array[i]) && isNumber(temp)) {
                    if (Integer.parseInt(temp) < Integer.parseInt(list.get(j))) {
                        temp = list.get(j);   // 如果都是数字 则比较大些，升序排列
                    }
                } else if (!(isNumber(array[i])) && !(isNumber(list.get(j)))){
                    if (isGreaterThan(array[i], list.get(j))) {
                        array[i] = list.get(j);
                        list.remove(list.get(j));
                    }
                }
            }
            list.remove(temp); // 删除该元素
        }
         */
    }

    // 字符串比较方法：‘a’大于‘b’
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // 传递的字符串是数字吗？
    public static boolean isNumber(String s) {
        /** 自定义
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (!Character.isDigit(c))
                return false;
        }

        return true;
         */

        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // 字符串包含连字符
                    || (!Character.isDigit(c) && c != '-') // 或不是数字并且不以连字符开头
                    || (i == 0 && c == '-' && chars.length == 1)) // 或为单个连字符
            {
                return false;
            }
        }
        return true;
    }
}
