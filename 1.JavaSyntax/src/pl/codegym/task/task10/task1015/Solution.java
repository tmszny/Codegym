package pl.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Tablica z listami ciągów
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static ArrayList<String>[] utworzList() {
        ArrayList<String>[] lista = new ArrayList[2];
        ArrayList<String> string1 = new ArrayList<>();
        ArrayList<String> string2 = new ArrayList<>();

        string1.add("string 1");
        string2.add("string 2");

        lista[0] = string1;
        lista[1] = string2;

        return lista;
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}