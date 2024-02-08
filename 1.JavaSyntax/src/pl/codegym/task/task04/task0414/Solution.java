package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rokS = reader.readLine();
        int rok = Integer.parseInt(rokS);

        int przystepny1 = rok % 400;
        int przystepny2 = rok % 4;
        int przystepny3 = rok % 100;
        int x;

        if (przystepny3 != 0 && przystepny2 == 0)
            x = 366;
        else
            x = 365;
        if (przystepny1 == 0)
            x = 366;

        System.out.println("Liczba dni w roku: " + x);

    }
}