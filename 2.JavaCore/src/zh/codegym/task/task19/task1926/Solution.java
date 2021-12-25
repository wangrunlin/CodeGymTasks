package zh.codegym.task.task19.task1926;

/* 
镜像图像
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bf.readLine()));
        bf.close();
        String line;
        while ((line = reader.readLine()) != null) {
            String result = new StringBuffer(line).reverse().toString();
            System.out.println(result);
        }

        reader.close();
    }
}
