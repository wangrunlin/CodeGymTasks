package zh.codegym.task.task19.task1908;

/* 
挑选数字
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bf.readLine();
        String file2 = bf.readLine();
        bf.close();

        BufferedReader reader = new BufferedReader(new FileReader(file1));
        String result = "";
        String line;
        while ((line = reader.readLine()) != null) {
            String[] tmp = line.split(" ");
            for (String str : tmp) {
                if (isNumber(str))
                    result += str + " ";
            }
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
        writer.write(result);
        writer.close();

    }

    private static boolean isNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
}
