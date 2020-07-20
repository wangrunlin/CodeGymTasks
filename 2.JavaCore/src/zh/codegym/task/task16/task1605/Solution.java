package zh.codegym.task.task16.task1605;

import java.util.Date;

/* 
谈谈音乐
*/

public class Solution {

    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("演奏者"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument {

        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " 开始演奏");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " 停止演奏");
            return new Date();
        }

        @Override
        public void run() {
            Date start = startPlaying();
            sleepNSeconds(1);
            Date stop = stopPlaying();
            long diff = stop.getTime() - start.getTime();
            System.out.println("以演奏 " + diff + " 毫秒");
        }
    }
}
