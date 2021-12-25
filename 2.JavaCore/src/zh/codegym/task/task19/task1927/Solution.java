package zh.codegym.task.task19.task1927;

/* 
上下文广告
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {

    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        String result = outputStream.toString();

        System.setOut(consoleStream);

        String[] lines = result.split("\n");
        for (int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
            if (i % 2 == 1)
                System.out.println("CodeGym - 在线 Java 课程");
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("第一");
            System.out.println("第二");
            System.out.println("第三");
            System.out.println("第四");
            System.out.println("第五");
        }
    }
}
