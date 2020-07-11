package zh.codegym.task.task13.task1319;

import java.io.*;

/* 
从控制台写入文件
*/

public class Solution {
    public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

            while (true) {
                String line = reader.readLine();
                writer.write(line);
                if (line.equals("exit"))
                    break;
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
