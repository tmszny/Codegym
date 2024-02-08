package pl.codegym.task.task06.task0606;

import java.io.*;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String liczbaS = reader.readLine();
        int dlugoscS = liczbaS.length();
        int liczba = Integer.parseInt(liczbaS);

        for(int i = 0; i < dlugoscS; i++) {

            int test1 = liczba % 10;
            liczba = liczba / 10;
            test1 = test1 % 2;

            if(test1 == 0) parzyste++;
            else nieparzyste++;
        }

        System.out.println("Parzyste: " + parzyste + " Nieparzyste: " + nieparzyste);
    }
}
