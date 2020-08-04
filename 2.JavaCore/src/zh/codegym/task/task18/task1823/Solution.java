package zh.codegym.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
线程和字节
*/

public class Solution {

    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file;
        while (true) {
            file = reader.readLine();
            if (file.equals("退出")) break;
            new ReadThread(file).start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                byte[] buff = new byte[inputStream.available()];
                inputStream.read(buff);
                inputStream.close();

                HashMap<Byte, Integer> map = new HashMap<>();
                for (byte b : buff) {
                    map.put(b, map.containsKey(b) ? map.get(b) + 1 : 1);
                }

                int max = Collections.max(map.values());
                for (byte b : map.keySet()) {
                    if (map.get(b).equals(max))
                        resultMap.put(fileName, (int) b);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
