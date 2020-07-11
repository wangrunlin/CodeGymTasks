package zh.codegym.task.task03.task0319;

/* 
预测
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String money = reader.readLine();
        String years = reader.readLine();

        System.out.println(name + "将在 " + years + " 年后收到 " + money);

        reader.close();
    }
}
