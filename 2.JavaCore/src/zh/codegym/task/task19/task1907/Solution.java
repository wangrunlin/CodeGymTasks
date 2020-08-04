package zh.codegym.task.task19.task1907;

/* 
字词计数
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bf.readLine();
        bf.close();
        FileReader reader = new FileReader(fileName);
        Scanner scanner = new Scanner(reader);
        // 以单词分割扫描仪
        scanner.useDelimiter("\\W");
        int count = 0;
        while (scanner.hasNext()) {
            String data = scanner.next();
            if (data.equals("world"))
                count++;
        }
        reader.close();
        scanner.close();
        System.out.println(count);
    }
}
