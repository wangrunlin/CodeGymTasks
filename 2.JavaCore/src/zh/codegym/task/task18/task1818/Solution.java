package zh.codegym.task.task18.task1818;

/* 
合二为一
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream file1 = new FileOutputStream(reader.readLine());
            FileInputStream file2 = new FileInputStream(reader.readLine());
            FileInputStream file3 = new FileInputStream(reader.readLine());

            byte[] buff1 = new byte[file2.available()];
            byte[] buff2 = new byte[file3.available()];

            file2.read(buff1);
            file3.read(buff2);

            file1.write(buff1);
            file1.write(buff2);

            reader.close();
            file1.close();
            file2.close();
            file3.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
