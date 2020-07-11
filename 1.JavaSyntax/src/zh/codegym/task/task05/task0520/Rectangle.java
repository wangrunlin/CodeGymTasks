package zh.codegym.task.task05.task0520;

/* 
创建 Rectangle 类
*/


import org.w3c.dom.css.Rect;

public class Rectangle {

    int top, left, width, height;

    public Rectangle() {
        width = height = 0;
    }

    public Rectangle(int width) {
        this.width = width;
        height = width;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, int left, int top) {
        this.width = width;
        this.height = height;
        this.left = left;
        this.top = top;
    }

    public static void main(String[] args) {

    }
}
