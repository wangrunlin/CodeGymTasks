package zh.codegym.task.task09.task0924;

import java.util.ArrayList;

/* 
恐怖故事
*/

public class Solution {
    public static RedRidingHood hood = new RedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Pie pie = new Pie();
    public static Woodcutter woodcutter = new Woodcutter();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(hood);
        wolf.ate.add(grandmother);
        woodcutter.killed.add(wolf);
    }

    // 小红帽
    public static class RedRidingHood extends StoryItem {
    }

    // 祖母
    public static class Grandmother extends StoryItem {
    }

    // 派
    public static class Pie extends StoryItem {
    }

    // 樵夫
    public static class Woodcutter extends StoryItem {
    }

    // 狼
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList ate = new ArrayList<>();
    }
}
