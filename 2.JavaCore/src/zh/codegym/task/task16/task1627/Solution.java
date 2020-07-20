package zh.codegym.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {

        public static volatile boolean isWinnerFound = false;

        public static List<String> actions = new ArrayList<>();

        static {
            actions.add("开始游戏");
            actions.add("收集资源");
            actions.add("增长经济");
            actions.add("杀死敌人");
        }

        protected Gamer gamer1 = new Gamer("史密斯", 3);
        protected Gamer gamer2 = new Gamer("琼斯", 1);
        protected Gamer gamer3 = new Gamer("盖茨", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {

        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            try {
                for (String action : OnlineGame.actions) {
                    System.out.println(getName() + ": " + action);
                    Thread.sleep(1000 / rating);
                }
                if (!OnlineGame.isWinnerFound) {
                    OnlineGame.isWinnerFound = true;
                    System.out.println(getName() + "：赢了！");
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + "：失败");
            }
        }
    }
}
