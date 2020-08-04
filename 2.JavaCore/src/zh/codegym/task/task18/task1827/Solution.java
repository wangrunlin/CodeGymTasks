package zh.codegym.task.task18.task1827;

/* 
价格
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        // 1. 从控制台读取进行操作的文件名

        // 3. 在不带参数运行程序时，产品列表保持不变
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    create(fileName, args);
                    break;
            }
        }

    }

    private static void create(String fileName, String[] args) throws IOException {

        FileReader fileReader = new FileReader(fileName);
        BufferedReader buf = new BufferedReader(fileReader);

        // 5. 找出最大id
        String str;
        int id = 0, max_id = 0;
        while ((str = buf.readLine()) != null) {
            id = Integer.parseInt(str.substring(0, 8).trim());
            if (id > max_id)
                max_id = id;
        }
        fileReader.close();
        buf.close();

        FileOutputStream outputStream = new FileOutputStream(fileName, true);
        String result = String.format("\n%-8s%-30s%-8s%-4s", ++max_id, args[1], args[2], args[3]);
        outputStream.write(result.getBytes());
        outputStream.close();

    }
}
