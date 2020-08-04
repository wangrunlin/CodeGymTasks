package zh.codegym.task.task19.task1909;

/* 
更改标点符号
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bf.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(bf.readLine()));
        bf.close();

        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line.replace(".", "!"));
        }

        reader.close();
        writer.close();

    }
}
