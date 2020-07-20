package zh.codegym.task.task13.task1326;

/* 
对文件中的偶数进行排序
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream file = new FileInputStream(bufferedReader.readLine());
            bufferedReader.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            ArrayList<Integer> list = new ArrayList<>();

            while (reader.ready()) {
                int temp = Integer.parseInt(reader.readLine());

                if (temp % 2 == 0)
                    list.add(temp);
            }

            file.close();
            reader.close();
            Collections.sort(list);
            for (int n : list)
                System.out.println(n);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
