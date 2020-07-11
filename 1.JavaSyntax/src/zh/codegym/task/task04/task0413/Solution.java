package zh.codegym.task.task04.task0413;

/* 
星期几
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(s);
        week(n);

    }

    public static void week(int n) {
        switch(n) {
            case 1:
                System.out.println("星期一"); break;
            case 2:
                System.out.println("星期二"); break;
            case 3:
                System.out.println("星期三"); break;
            case 4:
                System.out.println("星期四"); break;
            case 5:
                System.out.println("星期五"); break;
            case 6:
                System.out.println("星期六"); break;
            case 7:
                System.out.println("星期日"); break;
            default:
                System.out.println("一周中没有这一天");
                break;
        }
    }
}