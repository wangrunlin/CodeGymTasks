package zh.codegym.task.task20.task2004;

import java.io.*;

/* 
读取 static 字段并将其写入文件
*/

public class Solution {

    public static void main(String[] args) {
        // 你可以在 TMP 目录中找到 your_file_name.tmp，或者按照文件的实际位置调整 outputStream/inputStream
        try {

            File yourFile = File.createTempFile("你的文件名", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            // 在此检查 classWithStatic 对象是否等于 loadedObject 对象
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("糟糕，我的生活出现问题了");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("糟糕，save/load 方法出现问题");
        }
    }

    public static class ClassWithStatic {

        public static String staticString = "这是 static 测试字符串";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter pw = new PrintWriter(outputStream);
            pw.println(ClassWithStatic.staticString);
            pw.println(this.i);
            pw.println(this.j);
            pw.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String staticStr;
            String i, j;
            while ((staticStr = reader.readLine()) != null &&
                    (i = reader.readLine()) != null &&
                    (j = reader.readLine()) != null) {
                ClassWithStatic.staticString = staticStr;
                this.i = Integer.parseInt(i);
                this.j = Integer.parseInt(j);
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
