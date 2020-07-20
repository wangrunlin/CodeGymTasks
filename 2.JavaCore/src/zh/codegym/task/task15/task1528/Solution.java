package zh.codegym.task.task15.task1528;

/* 
OOP：欧元也是钱
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Euro().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    // 在下面添加代码
    public static class Euro extends Money {
        private double amount = 123d;

        public Euro getMoney() {
            return this;
        }

        @Override
        public Object getAmount() {
            return this.amount;
        }
    }
}
