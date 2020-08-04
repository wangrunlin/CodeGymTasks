package zh.codegym.task.task18.task1817;

/* 
空格
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(args[0]);

            byte[] buff = new byte[inputStream.available()];
            inputStream.read(buff);
            inputStream.close();

            int count = 0;
            for (int i = 0; i < buff.length; i++) {
                if (buff[i] == 32)
                    count++;
            }

            System.out.printf("%.2f\n", 1.0 * count / buff.length * 100);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
