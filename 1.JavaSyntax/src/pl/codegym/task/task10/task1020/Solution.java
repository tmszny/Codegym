package pl.codegym.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[30];
        for (int i = 0; i < 30; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);

        System.out.println(tablica[9]);
        System.out.println(tablica[10]);
    }

    public static void sortuj(int[] tablica) {
        for (int i = 0; i < tablica.length; i ++){
            for (int j = i; j < tablica.length; j++){
                if (tablica[i] > tablica[j]){
                    int temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
    }
}
