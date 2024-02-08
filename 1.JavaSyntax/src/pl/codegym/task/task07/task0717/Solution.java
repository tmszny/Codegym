package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplikowanie słów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            lista.add(reader.readLine());
        }

        ArrayList<String> wynik = doubleValues(lista);

        for (int i = 0; i < wynik.size(); i++){
            System.out.println(wynik.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        ArrayList<String> listaWynik = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++){
            listaWynik.add(lista.get(i));
            listaWynik.add(lista.get(i));
        }
        return listaWynik;
    }
}
