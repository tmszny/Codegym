package pl.codegym.task.task04.task0426;

/* 
Etykiety i liczby
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int przysta = a % 2;
        String s1, s2, s3;

       if (a == 0)
           System.out.println("Zero");
       else {

           if (przysta == 0) s1 = "parzysta";
           else s1 = "nieparzysta";

           if (a > 0) s2 = "Dodatnia";
           else s2 = "Ujemna";

           System.out.println(s2 + " liczba " + s1);
       }
    }
}
