package pl.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Więcej Ala ma kota
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       ArrayList<String> lista= new ArrayList<>();

       lista.add("Ala");
       lista.add("ma");
       lista.add("kota");

       lista.add(1, "As");
       lista.add(3, "As");
       lista.add("As");

       for (int i = 0; i < lista.size(); i++){
           System.out.println(lista.get(i));
       }
    }
}
