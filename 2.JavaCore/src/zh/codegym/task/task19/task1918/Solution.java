package zh.codegym.task.task19.task1918;

/* 
标记简介
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 从控制台读取文件名
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        FileReader reader = new FileReader(bf.readLine());

        char[] cbuf = new char[0];
        reader.read(cbuf);


        reader.close();
    }
}
