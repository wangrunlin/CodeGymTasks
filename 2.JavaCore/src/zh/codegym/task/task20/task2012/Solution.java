package zh.codegym.task.task20.task2012;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* 
OutputToConsole
*/

public class Solution {

    public static String greeting = "你好世界";

    /**
     * OutputToConsole 是一个内部基类，用于提高你的注意力。
     * OutputToConsole 对象封装向控制台显示
     * [greeting] 变量所需的信息。
     * @author CodeGym
     */
    public static class OutputToConsole implements Externalizable {
        private int counter;

        /**
         * @param out 用于外部化的流
         * @throws IOException
         */
        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(counter);
        }

        /**
         * @param in 用于反外部化的流
         * @throws IOException
         * @throws ClassNotFoundException
         */
        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            counter = in.readInt();
        }

        /**
         * 设置 private counter 字段的类构造方法
         */
        public OutputToConsole(int counter) {
            this.counter = counter;
        }

        /**
         * 将问候语消息输出到控制台 counter 次。
         */
        public void printMessage() {
            for (int i = 0; i < counter; i++) {
                System.out.println(greeting);
            }
        }
    }

    public static void main(String[] args) {

    }
}
