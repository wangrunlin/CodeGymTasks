package zh.codegym.task.task13.task1302;

/* 
啤酒 -第 2 部分：恢复。
*/

public class Solution {

    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "酒精类饮料";
            } else {
                return "非酒精类饮料";
            }

        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
}