package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

public class Solution {
    public static void main(String[] args) {
        Ludzie dziadek = new Ludzie("Józek", true, 86);
        Ludzie dziadek2 = new Ludzie("Czesław", true,75);
        Ludzie babcia = new Ludzie("Milka", false, 81);
        Ludzie babcia2 = new Ludzie("Halina", false, 70);
        Ludzie ojciec = new Ludzie("Leszek", true, 54, dziadek, babcia);
        Ludzie matka = new Ludzie("Bogusia", false, 49, dziadek2, babcia2);
        Ludzie dziecko1 = new Ludzie("Tomek", true, 25, ojciec, matka);
        Ludzie dziecko2 = new Ludzie("Magdalena", false, 24, ojciec, matka);
        Ludzie dziecko3 = new Ludzie("Nima", false, 11, ojciec, matka);

        System.out.println(dziadek);
        System.out.println(dziadek2);
        System.out.println(babcia);
        System.out.println(babcia2);
        System.out.println(ojciec);
        System.out.println(matka);
        System.out.println(dziecko1);
        System.out.println(dziecko2);
        System.out.println(dziecko3);
    }

    public static class Ludzie {
        String imie;
        boolean plec;
        int wiek;
        Ludzie ojciec;
        Ludzie matka;

        public Ludzie(String imie, boolean plec, int wiek){
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public Ludzie(String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka){
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.ojciec = ojciec;
            this.matka = matka;
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null) {
                tekst += ", ojciec: " + this.ojciec.imie;
            }

            if (this.matka != null) {
                tekst += ", matka: " + this.matka.imie;
            }

            return tekst;
        }
    }
}