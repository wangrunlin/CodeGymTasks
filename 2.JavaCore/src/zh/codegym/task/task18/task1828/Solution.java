package zh.codegym.task.task18.task1828;

/* 
价格 2
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        // 1. 从控制台读取进行操作的文件名

        // 2. 在不带参数运行程序时，产品列表保持不变
        if (args.length > 0) {
            switch (args[0]) {
                case "-u":
                    update(fileName, args);
                    break;
                case "-d" :
                    delete(fileName, args);
            }
        }
    }

    // 3. 在带参数“-u id 产品名 价格 数量”启动程序时，应更新文件中的产品信息。
    private static void update(String fileName, String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String result = "";
        String line;

        while ((line = reader.readLine()) != null) {
            if (line.substring(0, 8).trim().equals(args[1]))
                result += String.format("%-8s%-30s%-8s%-4s\n", args[1], args[2], args[3], args[4]);
            else
                result += line + "\n";
        }
        result = result.substring(0, result.lastIndexOf("\n"));

        FileOutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(result.getBytes());
        inputStream.close();
        outputStream.close();
        reader.close();
    }

    // 4. 在带参数“-d id”启动程序时，应从文件中删除具有指定 id 的产品的行。
    private static void delete(String fileName, String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String result = "";
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.substring(0, 8).trim().equals(args[1])) {
                result += line + "\n";
            }
        }
        result = result.substring(0, result.lastIndexOf("\n"));

        FileOutputStream outputStream = new FileOutputStream(fileName);
        outputStream.write(result.getBytes());

        inputStream.close();
        outputStream.close();
        reader.close();
    }
}
