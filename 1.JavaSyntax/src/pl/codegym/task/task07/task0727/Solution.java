package pl.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zmiana funkcjonalności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

        ArrayList<String> listaWynik = new ArrayList<String>();
        for (int i = 0; i < lista.size(); i++) {
            int x = lista.get(i).length() % 2;

            if (x == 0){
                String tekst = lista.get(i) + " ";
                listaWynik.add(tekst + tekst);
            }else{
                String tekst = lista.get(i) + " ";
                listaWynik.add(tekst + tekst + tekst);
            }
        }

        for (int i = 0; i < listaWynik.size(); i++) {
            System.out.println(listaWynik.get(i));
        }
    }
}
