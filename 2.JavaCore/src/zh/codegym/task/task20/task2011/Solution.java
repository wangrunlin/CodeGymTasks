package zh.codegym.task.task20.task2011;

/* 
公寓的 Externalizable
*/

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * 强制 public 无参数构造方法。
         */
        public Apartment() { super(); }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * 输出用于测试的字段！
         */
        public String toString() {
            return("地址：" + address + "\n" + "年：" + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }
    }

    public static void main(String[] args) {

    }
}
