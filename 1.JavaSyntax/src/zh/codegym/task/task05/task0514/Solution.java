package zh.codegym.task.task05.task0514;

/* 
程序员创建人
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("张三", 19);
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age =age;
        }
    }
}
