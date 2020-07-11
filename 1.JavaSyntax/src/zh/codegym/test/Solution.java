package zh.codegym.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
有关算法的任务
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s == null || s.isEmpty()){
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // 在此编写你的代码
        int x = 0;
        String y = new String();

        for(int i = 0; i<array.length; i++){
            if(isNumber(array[i])){ //比较数字
                int a = Integer.parseInt(array[i]);
                for(int n = i+1; n<array.length-1; n++){
                    if(!isNumber(array[n]))
                        continue;
                    else{
                        int b = Integer.parseInt(array[n]);
                        if(a<b){
                            x = a;
                            a = b;
                            b = x;
                            array[i] = Integer.toString(a);
                            array[n] = Integer.toString(b);
                            //y = array[i];
                            //array[i] = array[n];
                            //array[n] = y;
                        }
                    }
                }
            }else{ //比较字符串
                for(int n = i+1; n<array.length-1; n++){
                    if(isNumber(array[n]))
                        continue;
                    else{
                        if(isGreaterThan(array[i],array[n])){
                            y = array[n];
                            array[n] = array[i];
                            array[i] = y;
                        }
                    }
                }
            }
        }
    }

    // 字符串比较方法：‘a’大于‘b’
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // 传递的字符串是数字吗？
    public static boolean isNumber(String s) {
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
