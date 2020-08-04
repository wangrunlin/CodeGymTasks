package zh.codegym.task.task19.task1912;

/* 
Reader 包装类 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

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
        System.out.println(result.replace("te", "??"));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}
