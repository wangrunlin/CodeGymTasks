package zh.codegym.task.task18.task1824;

/* 
文件和异常
*/

import java.io.*;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = null;
        HashMap<String, FileInputStream> map = new HashMap<>();
        try {
            while (true) {
                file = reader.readLine();
                map.put(file, new FileInputStream(file));
            }
        } catch (FileNotFoundException e) {
            System.out.println(file);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                for (FileInputStream inputStream : map.values()) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
