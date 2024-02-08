package pl.codegym.task.task04.task0428;

/* 
Liczba dodatnia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int i = 0;

        if (a > 0) i++;
        if (b > 0) i++;
        if (c > 0) i++;

        System.out.println(i);



    }
}
