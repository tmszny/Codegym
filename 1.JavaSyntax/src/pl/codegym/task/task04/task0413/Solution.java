package pl.codegym.task.task04.task0413;

/* 
Dzień tygodnia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dzienS = reader.readLine();
        int dzien = Integer.parseInt(dzienS);

        if (dzien < 1 || dzien > 7)
            System.out.println("Nie ma takiego dnia tygodnia");
        if (dzien == 1)
            System.out.println("Poniedziałek");
        if (dzien == 2)
            System.out.println("Wtorek");
        if (dzien == 3)
            System.out.println("Środa");
        if (dzien == 4)
            System.out.println("Czwartek");
        if (dzien == 5)
            System.out.println("Piątek");
        if (dzien == 6)
            System.out.println("Sobota");
        if (dzien == 7)
            System.out.println("Niedziela");
    }
}