package zh.codegym.task.task04.task0421;

/* 
珍或珍？
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equals(name2))
            System.out.println("名字相同");
        else if (name1.length() == name2.length())
            System.out.println("名字长度相同");

    }
}
