package zh.codegym.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
反序列化
*/

public class Solution {

    public <e> A getOriginalObject(ObjectInputStream objectStream) {
        try {
            Object obj = objectStream.readObject();
            A a = null;
            if (obj instanceof A) {
                a = (A) obj;
            }
            return a;
        } catch (Exception e) {
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("在 B 内部");
        }
    }

    public static void main(String[] args) {

    }
}
