package zh.codegym.task.task19.task1904;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
另一个适配器
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if (fileScanner.hasNext()) {
                String line = fileScanner.nextLine();
                String[] array = line.split(" ", 4);

                Date date = null;
                try {
                    date = new SimpleDateFormat("MM dd yyyy").parse(array[3]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                person = new Person(array[2], array[0], array[1], date);
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
