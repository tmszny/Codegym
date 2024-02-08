package pl.codegym.task.task03.task0318;

/* 
Plan podboju świata
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

     InputStream inputStream = System.in;
     Reader inputStreamReader = new InputStreamReader(inputStream);
     BufferedReader bufferedReader = new BufferedReader((inputStreamReader));
     String sLiczba = bufferedReader.readLine();
     int Liczba = Integer.parseInt(sLiczba);
     String imie = bufferedReader.readLine();

     System.out.println(imie + " przejmie władzę nad światem za " + Liczba + " lat. Mua ha ha!");
    }
}
