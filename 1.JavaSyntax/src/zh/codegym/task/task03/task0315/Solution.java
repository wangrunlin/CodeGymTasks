package zh.codegym.task.task03.task0315;

/* 
七色彩虹...
*/

import com.sun.org.apache.xpath.internal.operations.Or;

public class Solution {

    public static void main(String[] args) {
        Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Indigo indigo = new Indigo();
        Violet violet = new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("红色");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("橙色");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("黄色");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("绿色");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("蓝色");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("靛色");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("紫色");
        }
    }
}
