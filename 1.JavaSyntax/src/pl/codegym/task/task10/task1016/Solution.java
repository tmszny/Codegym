package pl.codegym.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Identyczne wyrazy na liście
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> slowa = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            slowa.add(reader.readLine());
        }

        Map<String, Integer> mapa = liczSlowa(slowa);

        for (Map.Entry<String, Integer> para : mapa.entrySet()) {
            System.out.println(para.getKey() + " " + para.getValue());
        }
    }

    public static Map<String, Integer> liczSlowa(ArrayList<String> lista) {
        HashMap<String, Integer> wynik = new HashMap<String, Integer>();

        for (String slowo : lista){
            wynik.put(slowo, 0);
        }

        for (Map.Entry<String, Integer> para : wynik.entrySet()) {
            for (String slowoLista : lista) {
                if (para.getKey().equals(slowoLista)){
                    wynik.put(para.getKey(), para.getValue()+1);
                }

            }

        }


        return wynik;
    }

}


