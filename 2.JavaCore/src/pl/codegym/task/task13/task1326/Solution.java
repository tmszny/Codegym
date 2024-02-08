package pl.codegym.task.task13.task1326;

/* 
Sortowanie liczb parzystych z pliku
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lista = new ArrayList<>();
        String filePath = reader.readLine();
        InputStream inputStream = new FileInputStream(filePath);
        Scanner scaner = new Scanner(inputStream);

        while (scaner.hasNextInt()){

            int a = scaner.nextInt();
            if (a%2 == 0) {
                lista.add(a);
            }
        }
        inputStream.close();
        scaner.close();

        int[] parzyste = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++){
            parzyste[i] = lista.get(i);
        }

        for (int i = 0; i < parzyste.length; i++){
            for (int j = i; j < parzyste.length; j++){
                if(parzyste[i] > parzyste[j]){
                    int temp = parzyste[i];
                    parzyste[i] = parzyste[j];
                    parzyste[j] = temp;
                }
            }
        }

        for (int a : parzyste){
            System.out.println(a);
        }
    }
}
