package zh.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
数量最大的字节
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int maxByte = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());

        while (inputStream.available() > 0) {
            int temp = inputStream.read();
            if (temp > maxByte)
                maxByte = temp;
        }
        inputStream.close();

        System.out.println(maxByte);
    }
}
