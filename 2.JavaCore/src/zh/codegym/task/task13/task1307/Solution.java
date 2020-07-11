package zh.codegym.task.task13.task1307;

/* 
参数化的接口
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>
    {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}