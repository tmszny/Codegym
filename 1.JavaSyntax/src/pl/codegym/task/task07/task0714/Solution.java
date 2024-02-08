package pl.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Słowa na odwrót
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            lista.add(reader.readLine());
        }

        lista.remove(2);

        for (int i = lista.size() - 1 ; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }
}


