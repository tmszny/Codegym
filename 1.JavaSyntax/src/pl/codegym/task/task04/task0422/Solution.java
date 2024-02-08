package pl.codegym.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String imie = reader.readLine();
        String wiekS = reader.readLine();
        int wiek = Integer.parseInt(wiekS);

        if (wiek < 18)
            System.out.println("Podrośnij trochę");
    }
}
