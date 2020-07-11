package zh.codegym.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
10000 次插入所需的时间
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        Date start = new Date();    // 获取插入数据前的时间

        insert10000(list);          // 调用插入数据方法

        Date end = new Date();      // 获取插入数据后的时间

        return end.getTime() - start.getTime();     // 返回插入执行时间（毫秒）
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
