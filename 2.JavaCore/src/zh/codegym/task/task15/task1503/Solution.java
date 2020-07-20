package zh.codegym.task.task15.task1503;

/* 
OOP：汽车
*/

public class Solution {

    public static void main(String[] args) {
        new Solution.LuxuryCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.GeoMetro().printlnDesire();
    }

    public static class Ferrari extends LuxuryCar {
        @Override
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class GeoMetro extends CheapCar {
        @Override
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.GEO_METRO_NAME);
        }
    }

    public static class LuxuryCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURY_CAR);
        }
    }

    public static class CheapCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "我想开";
        public static String LUXURY_CAR = "豪车";
        public static String CHEAP_CAR = "便宜车";
        public static String FERRARI_NAME = "法拉利";
        public static String GEO_METRO_NAME = "雪弗兰";
    }
}
