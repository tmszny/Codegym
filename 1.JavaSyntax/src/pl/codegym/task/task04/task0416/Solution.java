package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());

        t = t % 5;

        if (t >= 0 && t < 3)
            System.out.println("zielone");
        else if (t >= 3 && t < 4)
            System.out.println("żółte");
        else if (t >=4 && t < 5)
            System.out.println("czerwone");







    }
}