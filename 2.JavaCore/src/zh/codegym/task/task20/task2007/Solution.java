package zh.codegym.task.task20.task2007;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
如何序列化 CodeGym？
*/

public class Solution {
    public static class CodeGym implements Serializable {
        public List<User> users = new ArrayList<>();

        public CodeGym() {
        }

        public CodeGym(List<User> users) {
            if (users != null)
                this.users = users;
        }
    }
}
