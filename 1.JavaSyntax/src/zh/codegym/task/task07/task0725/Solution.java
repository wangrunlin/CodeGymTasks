package zh.codegym.task.task07.task0725;

/* 
移动一个 static 修饰符
*/

public class Solution {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public int getValue() {
        return C;
    }
}
