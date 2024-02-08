package pl.codegym.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws IOException, ParseException {
        SimpleDateFormat dataFormat = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

            String[] sArray = args;

            if (sArray[0].equals("-c")) {

                if (sArray[2].equals("m")) {
                    allPeople.add(Person.createMale(sArray[1], new Date(Integer.parseInt(sArray[5]) -1900, Integer.parseInt(sArray[3]) - 1, Integer.parseInt(sArray[4]))));
                } else {
                    allPeople.add(Person.createFemale(sArray[1], new Date(Integer.parseInt(sArray[5]) - 1900, Integer.parseInt(sArray[3]) - 1, Integer.parseInt(sArray[4]))));
                }

                System.out.println(allPeople.size() - 1);

            } else if (sArray[0].equals("-u")) {

                int id = Integer.parseInt(sArray[1]);

                Person person = allPeople.get(id);

                person.setName(sArray[2]);

                if (sArray[3].equals("m")) {
                    person.setSex(Sex.MALE);
                } else {
                    person.setSex(Sex.FEMALE);
                }

                person.setBirthDate(new Date(Integer.parseInt(sArray[6]) - 1900, Integer.parseInt(sArray[4]) - 1, Integer.parseInt(sArray[5])));

                allPeople.set(id, person);

            } else if (sArray[0].equals("-d")) {

                int id = Integer.parseInt(sArray[1]);

                allPeople.get(id).setSex(null);
                allPeople.get(id).setName(null);
                allPeople.get(id).setBirthDate(null);

            } else if (sArray[0].equals("-i")) {

                StringBuilder finalS = new StringBuilder();
                int id = Integer.parseInt(sArray[1]);

                finalS.append(allPeople.get(id).getName()).append(" ");

                if (allPeople.get(id).getSex().equals(Sex.MALE)) {
                    finalS.append("m ");
                } else {
                    finalS.append("f ");
                }

                finalS.append(dataFormat.format(allPeople.get(id).getBirthDate()));

                System.out.println(finalS.toString());

            }

        }

        }


