package zh.codegym.task.task18.task1816;

/* 
ABC
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(args[0]);
            byte[] buff = new byte[inputStream.available()];
            while (inputStream.available() > 0) {
                inputStream.read(buff);
            }
            inputStream.close();

            int sum = 0;
            for (int i = 0; i < buff.length; i++) {
                byte b = buff[i];
                if (b >= 65 && b <= 90 || b >= 97 && b <= 122)
                    sum++;
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
