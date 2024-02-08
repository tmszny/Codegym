package pl.codegym.task.task03.task0319;

/* 
Prognozy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String imie = bufferedReader.readLine();
        String sLiczba1 = bufferedReader.readLine();
        int Liczba1 = Integer.parseInt(sLiczba1);
        String sLiczba2 = bufferedReader.readLine();
        int Liczba2 = Integer.parseInt(sLiczba2);

        System.out.println(imie + " dostanie " + Liczba1 +" za " + Liczba2 + " lat.");

    }
}
