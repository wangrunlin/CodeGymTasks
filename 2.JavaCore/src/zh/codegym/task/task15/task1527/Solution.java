package zh.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
请求解析器
*/

public class Solution {
    public static void main(String[] args) {

        String url = input();

        print(split(url));
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    private static String input() {
        /**
         * 输入函数 从键盘读取一行并返回
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = null;
        try {
            result = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void print(String[][] arrays) {
        /**
         * 显示所有参数的空格分隔列表
         * 如果存在 obj 参数，则将它的值传递到相关的 alert 方法。
         */
        for (String[] array : arrays) {
            System.out.print(array[0] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i][0].equals("obj")) {
                try {
                    alert(Double.parseDouble(arrays[i][1]));
                } catch (NumberFormatException e) {
                    alert(arrays[i][1]);
                }
            }
        }
    }

    private static String[][] split(String str) {
        /**
         * 截取 “？” 后面的字符串 并以 & 分割字符串
         * @return 一个二维字符数组
         * String[i][0] 为 = 之前  String[i][1] 为 = 等号之后
         */

        String sub = str.substring(str.indexOf("?") + 1);

        String[] split = sub.split("&");
        String[][] result = new String[split.length][2];
        for (int i = 0; i < split.length; i++) {
            result[i] = split[i].split("=");
        }

        return result;
    }
}
