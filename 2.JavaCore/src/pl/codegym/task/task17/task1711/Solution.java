package pl.codegym.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat inputDate = new SimpleDateFormat("MM dd yyyy");
        SimpleDateFormat outputDate = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    int numberC = (args.length - 1) / 5;

                    for (int i = 1; i < args.length; i =+ 6) {

                        String date = args[3 + i] + " " + args[4 + i] + " " + args[5 + i];
                        if (args[(2 + i)].equals('m')) {
                            allPeople.add(Person.createMale(args[1 + i], inputDate.parse(date)));
                        } else {
                            allPeople.add(Person.createFemale(args[1 + i], inputDate.parse(date)));
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;

            case "-u":
                synchronized (allPeople) {

                    for (int i = 1; i < args.length; i =+ 4) {

                        int idU = Integer.parseInt(args[i]);
                        String dateU = args[3+i];
                        String nameU = args[1 + i];
                        Sex sexU = null;

                        if (args[2 + i].equals("m")) {
                            sexU = Sex.MALE;
                        } else {
                            sexU = Sex.FEMALE;
                        }

                        allPeople.get(idU).setName(nameU);
                        allPeople.get(idU).setBirthDate(inputDate.parse(dateU));
                        allPeople.get(idU).setSex(sexU);
                    }
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {

                        int idD = Integer.parseInt(args[i]);

                        allPeople.get(idD).setName(null);
                        allPeople.get(idD).setBirthDate(null);
                        allPeople.get(idD).setSex(null);
                    }
                }
                break;

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {

                        int idD = Integer.parseInt(args[i]);

                        String nameI = allPeople.get(idD).getName();
                        String sexI = getSex(allPeople.get(idD).getSex());
                        String bdI = outputDate.format(allPeople.get(idD).getBirthDate());

                        System.out.println(nameI + " " + sexI + " " + bdI);
                    }
                }
                break;
        }
    }

    public static String getSex(Sex sex) {
        String resultSex;
        if (sex.equals(Sex.MALE)) {
            resultSex = "m";
        } else {
            resultSex = "f";
        }
        return resultSex;
    }
}