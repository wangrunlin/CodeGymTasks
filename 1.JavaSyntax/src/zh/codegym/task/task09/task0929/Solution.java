package zh.codegym.task.task09.task0929;

import java.io.*;

/* 
让代码发挥它的用武之地！
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 2; i++) {
            try {
                InputStream fileInputStream = getInputStream(reader.readLine());
                OutputStream fileOutputStream = getOutputStream(reader.readLine());

                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    fileOutputStream.write(data);
                }

                fileInputStream.close();
                fileOutputStream.close();
                break;  // 顺利退出
            } catch (FileNotFoundException e) {
                System.out.println("文件不存在");
            }
        }
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

