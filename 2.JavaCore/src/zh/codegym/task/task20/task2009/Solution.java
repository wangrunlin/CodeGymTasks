package zh.codegym.task.task20.task2009;

/* 
如何序列化 static 字段？
*/

import java.io.Serializable;

public class Solution {

    public static class ClassWithStatic implements Serializable {
        public static String staticString = "这是 static 测试字符串";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}
