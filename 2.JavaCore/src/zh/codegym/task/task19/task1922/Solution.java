package zh.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
搜索正确的行
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("文件");
        words.add("查看");
        words.add("在");
    }

    public static void main(String[] args) throws IOException {
        // 使用 BufferedReader 读取文件名 且使用 reader 读取文件
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bf.readLine()));
        // 关闭控制台输入
        bf.close();
        // 定义一个字符串变量存放每一行
        String line;


        while ((line = reader.readLine()) != null) {
            /**
             * 如果 line 为空 说明文件读取完毕，则退出循环
             * 定义计数器 并赋值为0
             * 将 line 与 words 列表对比
             * 如果每一行中包含 words 列表的两个元素 则显示
             */
            int count = 0;
            for (String str : words) {
                if (line.contains(str))
                    count++;
            }
            if (count == 2)
                System.out.println(line);
        }
        // 关闭文件输入流
        reader.close();
    }
}
