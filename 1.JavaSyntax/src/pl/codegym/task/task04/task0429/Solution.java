package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int i = 0;
        int j =0;

        if (a > 0) i++;
        else if (a < 0) j++;

        if (b > 0) i++;
        else if (b < 0) j++;

        if (c > 0) i++;
        else if (c < 0) j++;

        System.out.println("Liczba liczb ujemnych: " + j);
        System.out.println("Liczba liczb dodatnich: " + i);

    }
}
