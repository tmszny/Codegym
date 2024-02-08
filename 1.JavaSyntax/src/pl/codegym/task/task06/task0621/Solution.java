package pl.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Relacje między kotami
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Kot dziadek = new Kot(reader.readLine());
        Kot babcia = new Kot(reader.readLine());
        Kot ojciec = new Kot(reader.readLine(), dziadek, null);
        Kot mama = new Kot(reader.readLine(), null, babcia);
        Kot syn = new Kot(reader.readLine(), ojciec, mama);
        Kot corka = new Kot(reader.readLine(), ojciec, mama);

        System.out.println(dziadek);
        System.out.println(babcia);
        System.out.println(ojciec);
        System.out.println(mama);
        System.out.println(syn);
        System.out.println(corka);
    }

    public static class Kot {
        private String imie;
        private Kot ojciec;
        private Kot matka;

        Kot(String imie) {
            this.imie = imie;
        }

        Kot(String imie, Kot ojciec, Kot matka) {
            this.imie = imie;
            this.ojciec = ojciec;
            this.matka = matka;
        }


        @Override
        public String toString() {
            if (ojciec == null && matka == null) {
                return "Imię kota to " + imie + ", brak matki, brak ojca";
            } else if (ojciec == null) {
                return "Imię kota to " + imie + ", " + matka.imie + " to matka, brak ojca";
            } else if (matka == null){
                return "Imię kota to " + imie + ", brak matki, " + ojciec.imie + " to ojciec";
            } else {
                return "Imię kota to " + imie + ", " + matka.imie + " to matka, "+ ojciec.imie + " to ojciec";
            }
        }
    }
}
