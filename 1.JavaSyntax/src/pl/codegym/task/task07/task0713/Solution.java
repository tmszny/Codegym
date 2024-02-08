package pl.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Granie w Javarellę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> listaM = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> listaP = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            listaM.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < listaM.size(); i++){
            int x = listaM.get(i) % 3;
            int y = listaM.get(i) % 2;

            if (x == 0){
                lista3.add(listaM.get(i));
            }

            if (y == 0){
                lista2.add(listaM.get(i));
            }

            if (x != 0 && y != 0){
                listaP.add(listaM.get(i));
            }
        }

        printLista(lista3);
        printLista(lista2);
        printLista(listaP);
    }

    public static void printLista(List<Integer> lista) {

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
