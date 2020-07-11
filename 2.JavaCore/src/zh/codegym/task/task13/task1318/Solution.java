package zh.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
读取文件
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream(new File(reader.readLine()));
            byte[] array = new byte[inputStream.available()];
            inputStream.read(array);
            System.out.println(new String(array));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}