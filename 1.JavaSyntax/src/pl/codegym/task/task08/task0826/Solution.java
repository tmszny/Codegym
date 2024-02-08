package pl.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Pięciu wygranych
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);

        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        System.out.println(tablica[3]);
        System.out.println(tablica[4]);
    }

    public static void sortuj(int[] tablica) {
        int[] kopia = new int[tablica.length];
        int max =  tablica[0];
        int maxIndex = 0;
        int i = 0;

        while (i < tablica.length) {

            for (int j = 0; j < tablica.length; j++) {
                if (max < tablica[j]) {
                    max = tablica[j];
                    maxIndex = j;
                }
            }
            tablica[maxIndex] = 0;
            kopia[i] = max;
            max = tablica[0];
            i++;
        }
        for (int k = 0; k < tablica.length; k++) {
            tablica[k] = kopia[k];
        }
    }
}
