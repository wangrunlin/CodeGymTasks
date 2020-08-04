package zh.codegym.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

    /*
    构建文件
    */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        FileOutputStream fos = null;

        TreeSet<String> set = new TreeSet<>(new Com());
        while (true) {
            String path = reader.readLine();
            if (path.equals("end") || path.equals("结束")) break;
            set.add(path);
        }
        reader.close();

        while (set.size() > 0) {
            String path = set.pollFirst();
            if (fileName == null) {
                fileName = path.substring(0, path.lastIndexOf("."));
                File file = new File(fileName);
                if (!file.exists()) file.createNewFile();
                fos = new FileOutputStream(fileName);
            }

            int len;
            FileInputStream fis = new FileInputStream(path);
            byte[] data = new byte[fis.available()];
            while ((len = fis.read(data)) > 0) {
                fos.write(data, 0, len);
            }
            fis.close();
            fos.close();
        }
    }

    public static class Com implements Comparator {
        public int compare(Object o1, Object o2){
            String s1 = (String)o1;
            String s2 = (String)o2;
            if (s1.length() > s2.length()){
                return 1;
            } else if (s1.length() < s2.length()){
                return -1;
            } else {
                return s1.compareTo(s2);
            }
        }
    }
}
