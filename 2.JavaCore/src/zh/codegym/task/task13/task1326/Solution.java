package zh.codegym.task.task13.task1326;

/* 
对文件中的偶数进行排序
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            OutputStream outputStream = new FileOutputStream(new File(reader.readLine()));
            InputStream inputStream = new FileInputStream(new File(reader.readLine()));

//            reader = new BufferedReader(new InputStreamReader(inputStream));

//            ArrayList<Integer> list = new ArrayList<Integer>();
//            byte[] array = new byte[inputStream.available()];

            while (inputStream.available() > 0) {
                int n = inputStream.read();
//                String s = reader.readLine();
                System.out.println(n);
            }

            inputStream.close();

//            for (int i : list)
//                System.out.println(i);

//            for (int i = 0; i < list.size() - 1 ; i++) {
//                while (list.get(i) > list.get(i + 1)) {
//                    list.add(list.get(i));
//                    list.remove(i);
//                }
//            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

//    public static int[] toNumber(int[] array) {
//        int[] result = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//
//        }
//
//
//        return null;
//    }
}
