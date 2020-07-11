package zh.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
更改功能
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listNew = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            listNew.add(strCopy(list.get(i)));
        }

        for (int i = 0; i < listNew.size(); i++) {
            System.out.println(listNew.get(i));
        }
    }

    private static boolean isEven(String string) {
        int num = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch > 'a' && ch < 'z'|| ch > 'A' && ch < 'Z')
                num++;
        }
        return num % 2 == 0 ? true : false;
    }

    public static String strCopy(String string) {
        if (isEven(string))
            return string + " " + string;
        else
            return string + " " + string + " " + string;
    }
}
