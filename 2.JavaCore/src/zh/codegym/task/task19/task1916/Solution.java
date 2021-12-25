package zh.codegym.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
跟踪更改
*/

/**
 * not pass
 */

public class Solution {

    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(reader.readLine()));

//        BufferedReader file1 = new BufferedReader(new FileReader("A:\\myjava\\3.txt"));
//        BufferedReader file2 = new BufferedReader(new FileReader("A:\\myjava\\4.txt"));
        reader.close();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        while (file1.ready() && file2.ready()) {
            list1.add(file1.readLine());
            list2.add(file2.readLine());
        }

        boolean flag = false;
        int i = 0, k = 0;
        while (i < list1.size() && k < list2.size()) {
            if (list1.get(i).equals(list2.get(k))) {
                lines.add(new LineItem(Type.SAME, list1.get(i)));
                i++;
                k++;
                flag = true;
            }
            else if (flag) {
                if (list1.get(i + 1).equals(list2.get(k))) {
                    lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    k++;
                } else if (list1.get(i).equals(list2.get(k + 1))) {
                    lines.add(new LineItem(Type.ADDED, list2.get(k)));
                    i++;
                }
            }
        }

        file1.close();
        file2.close();

        for (LineItem lineItem : lines)
            System.out.println(lineItem);
    }

    public static enum Type {
        ADDED,        // 添加了新行
        REMOVED,      // 删除了行
        SAME          // 无更改
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
