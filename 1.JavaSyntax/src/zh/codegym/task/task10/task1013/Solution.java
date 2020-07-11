package zh.codegym.task.task10.task1013;

/* 
Human 类构造函数
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private byte age;
        private String name;
        private short height;
        private boolean sex;
        private long idNumber;
        private String profession;

        public Human() {}
        public Human(String name, byte age, short height, boolean sex, long idNumber, String profession) {}
        public Human(String name) {}
        public Human(String name, byte age) {}
        public Human(String name, byte age, short height) {}
        public Human(String name, byte age, boolean sex) {}
        public Human(String name, byte age, boolean sex, long idNumber) {}
        public Human(long idNumber) {}
        public Human(long idNumber, String profession) {}
        public Human(boolean sex) {}
    }
}
