package zh.codegym.task.task18.task1820;

/* 
数字四舍五入
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        // 创建输入 输出流
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        // 从第一个文件读取数据
        byte[] buff = new byte[inputStream.available()];
        inputStream.read(buff);
        inputStream.close();

        // 遍历每一个数组
        String numberStr = new String(buff);
        String result = "";
        for (String s : numberStr.split(" ")) {
            float f = Float.parseFloat(s);
            result += Math.round(f) + " ";
        }

        outputStream.write(result.getBytes());
        outputStream.close();
    }
}
