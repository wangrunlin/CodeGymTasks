package zh.codegym.task.task09.task0918;

/* 
相识是缘分，连异常都不例外
*/

import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends ArithmeticException{
    }

    static class MyException2 extends IndexOutOfBoundsException{
    }

    static class MyException3 extends FileNotFoundException {
    }

    static class MyException4 extends IOException{
    }
}

