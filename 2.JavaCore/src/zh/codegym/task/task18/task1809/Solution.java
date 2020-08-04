package zh.codegym.task.task18.task1809;

/* 
反转文件
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1 = new FileInputStream(reader.readLine());
            FileOutputStream file2 = new FileOutputStream(reader.readLine());

            byte[] buff = new byte[file1.available()];
            file1.read(buff);
            reverse(buff);
            file2.write(buff);
            file1.close();
            file2.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void reverse(byte[] buff) {
        for (int i = 0; i < buff.length; i++) {
            byte temp = buff[i];
            buff[i] = buff[buff.length - i - 1];
            buff[buff.length - i - 1] = temp;
        }
    }
}
