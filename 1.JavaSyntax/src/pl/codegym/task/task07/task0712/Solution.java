package pl.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Najkrótszy czy najdłuższy
*/

public class Solution {
    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> lista = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < 10; i++){
            lista.add(reader.readLine());
            if (lista.get(i).length() > max) max = lista.get(i).length();
        }

        int min = lista.get(0).length();

        for (int i = 0; i < lista.size(); i++){
            if (min > lista.get(i).length()) min = lista.get(i).length();
        }

        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).length() == min){
                System.out.println(lista.get(i));
                break;
            }
            else if (lista.get(i).length() == max){
                System.out.println(lista.get(i));
                break;
            }
        }

    }
}
