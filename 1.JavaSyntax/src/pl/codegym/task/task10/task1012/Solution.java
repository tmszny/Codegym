package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Liczba liter
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alfabet
        String abc = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
        char[] abcTablica = abc.toCharArray();

        ArrayList<Character> alfabet = new ArrayList<>();
        for (char litera : abcTablica) {
            alfabet.add(litera);
        }

        // Czyta ciągi
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            lista.add(s.toLowerCase());
        }

        int[] licznik = new int[abcTablica.length];
        ArrayList<Character> litery = new ArrayList<>();

        for (String slowo : lista){
            char[] literyP = slowo.toCharArray();
            for (char literaS : literyP) {
                litery.add(literaS);
            }
        }

        for (int i = 0; i < abcTablica.length; i++){
            for (char literaF : litery) {
                if (literaF == alfabet.get(i)){
                    licznik[i]++;
                }
            }
        }
       for (int i = 0; i < alfabet.size(); i++){
           System.out.println(alfabet.get(i) + " " + licznik[i]);
       }

    }

}
