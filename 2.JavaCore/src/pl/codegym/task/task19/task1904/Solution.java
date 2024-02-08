package pl.codegym.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
Jeszcze jeden adapter
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScaner) {
            this.fileScanner = fileScaner;
        }

        @Override
        public Person read() throws IOException {
            String[] data = fileScanner.nextLine().split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(data[5]), Integer.parseInt(data[3]) - 1, Integer.parseInt(data[4]));
            Date date = calendar.getTime();

            return new Person(data[2], data[0], data[1], date);

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
