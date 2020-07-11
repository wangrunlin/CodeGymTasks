package zh.codegym.task.task04.task0432;



/* 
好东西也不能索取无度
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        stringCirculation(string, n);

    }

    public static void stringCirculation(String s, int n) {
        while(n > 0) {
            System.out.println(s);
            n--;
        }
    }
}
