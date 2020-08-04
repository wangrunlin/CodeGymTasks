package zh.codegym.task.task18.task1808;

/* 
分割文件
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileInputStream file1 = new FileInputStream(reader.readLine());
            FileOutputStream file2 = new FileOutputStream(reader.readLine());
            FileOutputStream  file3 = new FileOutputStream(reader.readLine());

            byte[] buff = new byte[file1.available()];
            int count = file1.read(buff);
            int half = count / 2;
            if (count % 2 == 0) {
                file2.write(buff, 0, half);
                file3.write(buff, half, half);
            } else {
                file2.write(buff, 0, half + 1);
                file3.write(buff, half + 1, half);
            }
            file1.close();
            file2.close();
            file3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
