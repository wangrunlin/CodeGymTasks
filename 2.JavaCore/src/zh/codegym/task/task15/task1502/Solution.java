package zh.codegym.task.task15.task1502;

/* 
OOP：动物继承
*/

public class Solution {
    // Add the Goose and Dragon classes here

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "像恐龙";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "像猫";
        }
    }

    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            return "鹅很小，" + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "龙很大，" + super.getSize();
        }
    }
}
