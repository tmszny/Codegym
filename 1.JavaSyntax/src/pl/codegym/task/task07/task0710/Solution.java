package pl.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Na szczycie listy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            lista.add(0, reader.readLine());
        }

        for (int i = 0; i < 10; i++){
            System.out.println(lista.get(i));
        }
    }
}
