package zh.codegym.task.task19.task1923;

/* 
包含数字的字词
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 定义文件输入和输出变量
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);

        // 正则表达式匹配是否包含数字
        String check = ".*\\d.*";
        String line;
        String result = "";
        while ((line = reader.readLine()) != null) {
            /**
             * 读取文件的每一行数据，数据为空则说明文件读取完毕，退出循环
             * 使用 String.split 方法得到一个以空格分割而成的字符串数组
             * 向 writer 里添加 包含数字的所有字词
             */
            String[] split = line.split(" ");
            for (String word : split) {
                if (word.matches(check))
                    result += word + " ";
            }
        }
        // 删除最后一个空格
        result = result.substring(0, result.length() - 1);

        writer.write(result);
        // 关闭文件输入输出
        reader.close();
        writer.close();
    }
}
