package zh.codegym.task.task19.task1915;

/* 
重复文本
*/

import java.io.*;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        //在一个特殊变量中保存当前的 PrintStream
        PrintStream consoleStream = System.out;

        //创建动态数组
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //创建 PrintStream 类的适配器
        PrintStream stream = new PrintStream(outputStream);
        //将其设置为当前的 System.out
        System.setOut(stream);

        //调用一个对我们的更改一无所知的函数
        testString.printSomething();

        //将写入 ByteArray 的数据转换为字符串
        String result = outputStream.toString();

        //将一切恢复原样
        System.setOut(consoleStream);

        FileOutputStream outputStream1 = new FileOutputStream(fileName);
        outputStream1.write(result.getBytes());
        outputStream1.close();
        System.out.print(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("这是用于测试的文本");
        }
    }
}

