package zh.codegym.task.task05.task0522;

/* 
最大数量的构造方法
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle() {
        this(1, 1, 5);
    }

    public Circle(double radius) {
        this(1, 1, radius);
    }

    public Circle(double x, double y) {
        this(x, y, 5);
    }

    public static void main(String[] args) {

    }
}