package zh.codegym.task.task20.task2010;

/* 
如何序列化你自己的东西？
*/

import java.io.Serializable;

public class Solution {

    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static int stringCount;

    public static class String implements Serializable {

        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("字符串 #" + number);
        }
    }

    public static void main(String[] args) {

    }
}
