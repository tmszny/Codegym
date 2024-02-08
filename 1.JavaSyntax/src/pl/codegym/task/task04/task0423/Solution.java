package pl.codegym.task.task04.task0423;

/* 
Strategia ochroniarzy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imie = reader.readLine();
        int wiek = Integer.parseInt(reader.readLine());

        if (wiek > 20)
            System.out.println("Wystarczy, że masz 18");
    }
}
