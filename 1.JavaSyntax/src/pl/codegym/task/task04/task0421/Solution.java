package pl.codegym.task.task04.task0421;

/* 
Jola czy Jola?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imie1 = reader.readLine();
        String imie2 = reader.readLine();

        if (imie1.equals(imie2))
            System.out.println("Imiona są identyczne");
        else if (imie1.length() == imie2.length())
            System.out.println("Imiona są takiej samej długości");
    }
}
