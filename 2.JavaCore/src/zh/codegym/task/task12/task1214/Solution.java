package zh.codegym.task.task12.task1214;

/* 
牛也是动物
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "Cow";
        }
    }

}
