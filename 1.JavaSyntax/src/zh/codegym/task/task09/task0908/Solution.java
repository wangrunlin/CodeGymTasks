package zh.codegym.task.task09.task0908;

/* 
使用字符串时发生异常
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
