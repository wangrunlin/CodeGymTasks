package zh.codegym.task.task18.task1807;

/* 
计算逗号的数量
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        byte[] buff = new byte[inputStream.available()];

        inputStream.read(buff);
        inputStream.close();

        int sum = 0;
        for (byte b : buff) {
            if (b == 44)
                sum++;
        }
        System.out.println(sum);
    }
}
