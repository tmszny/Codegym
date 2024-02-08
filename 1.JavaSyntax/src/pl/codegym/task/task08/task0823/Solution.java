package pl.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Character.toUpperCase;

/* 
Ruszamy na cały kraj
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] litery = s.toCharArray();

        litery[0] = toUpperCase(litery[0]);
        
        for (int i = 0; i < litery.length; i++){
            String litera = Character.toString(litery[i]);
            if (litera.equals(" ")){
              litery[i+1] = Character.toUpperCase(litery[i+1]);

            }
        }

        for (char znak : litery) {
            System.out.print(znak);

        }

    }
}
