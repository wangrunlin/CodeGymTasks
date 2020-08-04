package zh.codegym.task.task19.task1906;

/* 
偶数字符
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bf.readLine();
        String fileName2 = bf.readLine();
        bf.close();

        FileReader reader = new FileReader(fileName1);
        FileWriter writer = new FileWriter(fileName2);

        int count = 0, data;
        while (reader.ready()) {
            data = reader.read();
            count++;
            if (count % 2 == 0) {
                writer.write(data);
            }
        }
        reader.close();
        writer.close();
    }
}
