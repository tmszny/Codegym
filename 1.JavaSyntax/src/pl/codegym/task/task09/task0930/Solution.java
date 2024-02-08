package pl.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            lista.add(s);
        }

        String[] tablica = lista.toArray(new String[lista.size()]);
        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
        ArrayList<Integer> liczby = new ArrayList<>();
        ArrayList<String> slowa = new ArrayList<>();


        for (String x : tablica){
            if (isLiczba(x)){
                liczby.add(Integer.parseInt(x));
            }else{
                slowa.add(x);
            }
        }
        Integer[] tablicaL = liczby.toArray(new Integer[liczby.size()]);
        String[] tablicaS = slowa.toArray(new String[slowa.size()]);

        for (int i = 0; i < tablicaL.length; i++){
            for (int j = i; j < tablicaL.length; j++){
                if(tablicaL[j] > tablicaL[i]){
                    int temp = tablicaL[i];
                    tablicaL[i] = tablicaL[j];
                    tablicaL[j] = temp;
                }
            }
        }

        for (int i = 0; i < tablicaS.length; i++){
            for (int j = i; j < tablicaS.length; j++){
                if(isWiekszeOd(tablicaS[i], tablicaS[j])){
                    String temp = tablicaS[i];
                    tablicaS[i] = tablicaS[j];
                    tablicaS[j] = temp;
                }
            }
        }
        int liczbaIndex = 0;
        int slowoIndex = 0;

        for (int i = 0; i < tablica.length; i++){
            if (isLiczba(tablica[i])){
                tablica[i] = Integer.toString(tablicaL[liczbaIndex]);
                liczbaIndex++;
            }else{
                tablica[i] = tablicaS[slowoIndex];
                slowoIndex++;
            }
        }
    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'
    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Czy przekazywany ciąg jest liczbą?
    public static boolean isLiczba(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (i != 0 && c == '-') { // Ciąg zawiera łącznik
                return false;
            }
            if (!Character.isDigit(c) && c != '-') { // lub nie jest liczbą i nie zaczyna się łącznikiem
                return false;
            }
            if (i == 0 && c == '-' && chars.length == 1) { // lub jest pojedynczym łącznikiem
                return false;
            }
        }
        return true;
    }
}
