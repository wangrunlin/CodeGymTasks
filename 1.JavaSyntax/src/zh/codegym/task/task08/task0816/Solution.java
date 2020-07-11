package zh.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
善良的艾玛和暑假
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        DateFormat sdf = new SimpleDateFormat("MM");
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("史泰龙", df.parse("JUNE 1 1980"));

        // -----------------
        map.put("阿林", df.parse("APRIL 8 2001"));
        map.put("张贰", df.parse("March 7 1996"));
        map.put("张叁", df.parse("December 7 1996"));
        map.put("张肆", df.parse("JULY 7 1996"));
        map.put("张伍", df.parse("December 7 1996"));
        map.put("张陆", df.parse("March 7 1996"));
        map.put("张柒", df.parse("JULY 7 1996"));
        map.put("张捌", df.parse("December 7 1996"));
        map.put("张玖", df.parse("JULY 7 1996"));

//        for (int i = 1; i < 10; i++) {
//            map.put("name" + i, df.parse(sdf.parse(String.valueOf(i)) + " " + i + " " + (1900 + i)));
//        }

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator(); // 构造 map 的迭代器

        while (iter.hasNext()) {
            Map.Entry<String, Date> pair = iter.next();     // 如果迭代器有下一个元素 则将将下一对实体存入 entry 中
            int month = pair.getValue().getMonth();         // 获取月份

            if (month >= 5 && month <= 7)
                iter.remove();                              // 删除生日在夏天出生的所有人
        }

    }

    public static void main(String[] args) throws ParseException {
//        HashMap<String, Date> hashMap = createMap();
//
//        for (Map.Entry<String, Date> entry : hashMap.entrySet())
//            System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
