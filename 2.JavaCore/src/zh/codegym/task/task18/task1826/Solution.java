package zh.codegym.task.task18.task1826;

/* 
加密
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String a = args[0];
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        byte[] buff = new byte[inputStream.available()];
        if (a.equals("-e")) {
            inputStream.read(buff);
            for (int i = 0; i < buff.length; i++) buff[i]++;
            outputStream.write(buff);
        }

        if (a.equals("-d")) {
            inputStream.read(buff);
            for (int i = 0; i < buff.length; i++) buff[i]--;
            outputStream.write(buff);
        }

        inputStream.close();
        outputStream.close();
    }

}
