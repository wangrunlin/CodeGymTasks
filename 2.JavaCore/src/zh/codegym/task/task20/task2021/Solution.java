package zh.codegym.task.task20.task2021;

import java.io.*;

/* 
禁止序列化
*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        public SubSolution() throws NotSerializableException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {

    }
}
