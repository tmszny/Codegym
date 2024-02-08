package pl.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Minimum i maksimum w tablicach
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        int[] lista = new int[20];
        for (int i = 0; i < 20; i++){
            lista[i] = Integer.parseInt(reader.readLine());
        }
        int maksimum = lista[0];
        int minimum = lista[0];

        for (int i = 0; i < lista.length; i++){
            if (lista[i] < minimum){
                minimum = lista[i];
            }
            if (lista[i] > maksimum){
                maksimum = lista[i];
            }
        }



        System.out.print(maksimum + " " + minimum);
    }
}
