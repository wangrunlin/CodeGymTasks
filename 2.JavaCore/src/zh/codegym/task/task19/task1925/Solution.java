package zh.codegym.task.task19.task1925;

/* 
长字词
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);
        String line;
        String result = "";
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.length() > 6)
                    result += word + ",";
            }
        }
        // 去除最后面的逗号
        if (result.length() > 0)
            result = result.substring(0, result.length()-1);
        writer.write(result);
//        writer.write(result, 0, result.length() - 1);

        reader.close();
        writer.close();
    }
}
