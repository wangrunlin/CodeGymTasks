package zh.codegym.task.task05.task0513;

/* 
我们来组合一个矩形
*/

public class Rectangle {

    int left, top, width, height;

    public void initialize() {
        width = height = 0;
    }

    public void initialize(int width) {
        this.width = width;
        height = width;
    }

    public void initialize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void initialize(int width, int height, int left, int top) {
        this.width = width;
        this.height = height;
        this.left = left;
        this.top = top;
    }

    public static void main(String[] args) {

    }
}
