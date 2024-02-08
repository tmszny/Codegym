package pl.codegym.task.task04.task0424;

/* 
Trzy liczby
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int Liczba1 = Integer.parseInt(reader.readLine());
        int Liczba2 = Integer.parseInt(reader.readLine());
        int Liczba3 = Integer.parseInt(reader.readLine());

        if (Liczba1 == Liczba2 && Liczba1 != Liczba3)
            System.out.println("3");
        else if (Liczba1 == Liczba3 && Liczba1 != Liczba2)
            System.out.println("2");
        else if (Liczba2 == Liczba3 && Liczba2 != Liczba1)
            System.out.println("1");
    }
}
