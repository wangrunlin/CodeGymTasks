package zh.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
约翰 约翰逊
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        while ((line = reader.readLine()) != null) {
            String name = line.replaceAll("[0-9]", "").trim();
            String date = line.replaceAll("[^0-9 ]", "").trim();
            PEOPLE.add(new Person(name, new SimpleDateFormat("MM dd yyyy").parse(date)));
        }
        reader.close();

        for (Person person : PEOPLE)
            System.out.println(person);
    }
}
