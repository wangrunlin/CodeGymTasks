 package zh.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
事务性
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 从控制台读取两个文件名
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();

            // 将文件逐行读取
            BufferedReader bf1 = new BufferedReader(new FileReader(new File(file1)));
            while (bf1.ready()) {
                allLines.add(bf1.readLine());
            }
            bf1.close();

            BufferedReader bf2 = new BufferedReader(new FileReader(new File(file2)));
            while (bf2.ready()) {
                linesForRemoval.add(bf2.readLine());
            }
            bf2.close();

            Solution solution = new Solution();
            solution.joinData();

            /* 显示列表
            for (String s : allLines)
                System.out.println(s);

            System.out.println("-----splitLine-----");

            for (String s : linesForRemoval)
                System.out.println(s);
             */

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        /**
         * 如果 allLines 列表 包含 linesForRemoval 列表 中所有行
         * 则 删除 aliLines 列表中 linesForRemoval 列表中 的所有行
         * 否则 清除 allLines 列表 并 抛出 CorruptedDataException
         */
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
