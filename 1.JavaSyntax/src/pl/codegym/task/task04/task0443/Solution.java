package pl.codegym.task.task04.task0443;


/* 
Imię to imię
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String imie = reader.readLine();
        int rok = Integer.parseInt(reader.readLine());
        int miesiac = Integer.parseInt(reader.readLine());
        int dzien = Integer.parseInt(reader.readLine());
        System.out.println("Mam na imię " + imie + ".");System.out.println("Urodziłem/am się " + miesiac + "/" + dzien + "/" + rok);}}