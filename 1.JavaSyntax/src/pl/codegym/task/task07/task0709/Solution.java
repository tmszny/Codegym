package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Mów zwięźle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i <5; i++){
            lista.add(reader.readLine());
        }

        int min = lista.get(0).length();

        for (int i = 0; i < lista.size(); i++){
            if (min > lista.get(i).length()) min = lista.get(i).length();
        }

        for (int i = 0; i < lista.size(); i++){
            if (min == lista.get(i).length()) System.out.println(lista.get(i));
        }


    }
}
