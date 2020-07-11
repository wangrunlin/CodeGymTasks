package zh.codegym.task.task03.task0318;

/* 
计划征服全世界
*/

import java.io.*;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        String name = reader.readLine();

        System.out.println(name + "将在 " + number + " 年后征服全世界。哈哈哈哈！");
        reader.close();
    }
}
