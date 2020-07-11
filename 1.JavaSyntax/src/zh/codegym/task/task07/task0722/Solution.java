package zh.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
结束
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (;;) {
            String string = reader.readLine();
            if (string.contains("结束"))
                break;
            list.add(string);
        }

        for (String s : list)
            System.out.println(s);
    }
}