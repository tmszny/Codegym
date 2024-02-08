package pl.codegym.task.task04.task0427;

/* 
Opisywanie liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String aS = reader.readLine();
        int a = Integer.parseInt(aS);

        String cyfry;
        String parzysta;
        int parz = a % 2;

        if (a >= 1 && a < 1000) {

            if (aS.length() == 1)
                cyfry = "jednocyfrowa";
            else if (aS.length() == 2)
                cyfry = "dwucyfrowa";
            else
                cyfry = "trzycyfrowa";

            if (parz == 0)
                parzysta = "parzysta";
            else
                parzysta = "nieparzysta";

            System.out.println(parzysta + " liczba " + cyfry);

        }


    }
}
