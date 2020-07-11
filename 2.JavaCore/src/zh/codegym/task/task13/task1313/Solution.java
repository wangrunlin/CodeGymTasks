package zh.codegym.task.task13.task1313;

import java.awt.*;

/* 
狐狸是动物
*/

public class Solution {

    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        static Color getColor() {
            return null;
        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "狐狸";
        }
    }
}