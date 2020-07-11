package zh.codegym.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
处理日期
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
//        System.out.println(isDateOdd("JANUARY 1 2000"));
//        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        DateFormat sdf = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        long betweenDays = 0;
        try {
            Date date1 = sdf.parse(date);
            Date date2 = sdf.parse("JANUARY 1 " + date1.getYear());
            betweenDays += (date1.getTime() - date2.getTime()) / (60*60*24*1000);

        } catch (Exception e) {
            date = null;
        }

        return betweenDays % 2 == 0;
    }
}
