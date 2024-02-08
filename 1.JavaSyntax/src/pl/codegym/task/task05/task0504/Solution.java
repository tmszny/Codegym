package pl.codegym.task.task05.task0504;

/* 
Trzej Muszkoterowie
*/

public class Solution {
    public static void main(String[] args) {
        Kot kot1 = new Kot("Marek", 5, 10, 100);
        Kot kot2 = new Kot("Mietek", 15, 6, 150 );
        Kot kot3 = new Kot("Waldek", 10, 11,123);

    }

    public static class Kot {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }
    }
}