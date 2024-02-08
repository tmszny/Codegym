package pl.codegym.task.task04.task0412;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String aS = reader.readLine();
        int a = Integer.parseInt(aS);

        if (a > 0)
            System.out.println(a*2);
        if (a < 0)
            System.out.println(a+1);
        if (a==0)
            System.out.println(0);



    }

}