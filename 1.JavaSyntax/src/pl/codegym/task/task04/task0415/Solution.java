package pl.codegym.task.task04.task0415;

/* 
Zasada trójkąta
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String aS = reader.readLine();
        int a = Integer.parseInt(aS);

        String bS = reader.readLine();
        int b = Integer.parseInt(bS);

        String cS = reader.readLine();
        int c = Integer.parseInt(cS);

        if (a+b > c && a+c > b && b+c > a)
            System.out.println("Da się zbudować trójkąt.");
        else
            System.out.println("Nie da się zbudować trójkąta.");



    }
}