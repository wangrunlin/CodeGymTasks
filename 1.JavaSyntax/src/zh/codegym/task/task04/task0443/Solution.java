package zh.codegym.task.task04.task0443;


/* 
名字就是名字
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int year = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int day = Integer.parseInt(reader.readLine());

        System.out.println("我的名字叫" + name + "。");
        System.out.println("我出生于 " + month + "/" + day + "/" + year);

    }
}
