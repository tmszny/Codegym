package pl.codegym.task.task10.task1013;

/* 
Konstruktory klasy Ludzie
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Ludzie {
        private String imie;
        private int wiek;
        private boolean plec;
        private Ludzie matka;
        private Ludzie ojciec;
        private String adres;

        public Ludzie(String imie){
            this.imie = imie;
        }
        public Ludzie(String imie, int wiek){
            this.imie = imie;
            this.wiek = wiek;
        }
        public Ludzie(String imie, int wiek, boolean plec){
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
        }
        public Ludzie(String imie, int wiek, boolean plec, String adres){
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
            this.adres = adres;
        }
        public Ludzie(Ludzie matka, Ludzie ojciec){
            this.matka = matka;
            this.ojciec = ojciec;
        }
        public Ludzie(String imie, int wiek, boolean plec, String adres, Ludzie matka, Ludzie ojciec){
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
            this.adres = adres;
            this.matka = matka;
            this.ojciec = ojciec;
        }
        public Ludzie(int wiek, boolean plec, String adres, Ludzie matka, Ludzie ojciec){
            this.wiek = wiek;
            this.plec = plec;
            this.adres = adres;
            this.matka = matka;
            this.ojciec = ojciec;
        }
        public Ludzie(boolean plec, String adres, Ludzie matka, Ludzie ojciec){
            this.plec = plec;
            this.adres = adres;
            this.matka = matka;
            this.ojciec = ojciec;
        }
        public Ludzie(String adres, Ludzie matka, Ludzie ojciec){
            this.adres = adres;
            this.matka = matka;
            this.ojciec = ojciec;
        }
        public Ludzie(String imie, int wiek, boolean plec,Ludzie matka, Ludzie ojciec){
            this.imie = imie;
            this.wiek = wiek;
            this.plec = plec;
            this.matka = matka;
            this.ojciec = ojciec;

        }

    }
}
