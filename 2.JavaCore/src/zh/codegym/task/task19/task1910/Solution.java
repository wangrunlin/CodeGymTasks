package zh.codegym.task.task19.task1910;

/* 
标点符号
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(input.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(input.readLine()));
        input.close();

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line.replaceAll("[^a-zA-Z ]", ""));
        }

        reader.close();
        writer.close();
    }
}
