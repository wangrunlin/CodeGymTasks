package zh.codegym.task.task18.task1822;

/* 
查找文件中的数据
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int id = Integer.parseInt(args[0]);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        BufferedReader bf = new BufferedReader(new FileReader(file));
        String line;

        while (bf.ready()) {
            line = bf.readLine();
            String[] lineSplit = line.split(" ");
            if (Integer.parseInt(lineSplit[0]) == id)
                System.out.println(line);
        }
        bf.close();
    }
}
