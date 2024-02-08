package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Ludzie dziecko1 = new Ludzie();
        dziecko1.imie = "dziecko1";
        dziecko1.plec = true;
        dziecko1.wiek = 11;

        Ludzie dziecko2 = new Ludzie();
        dziecko2.imie = "dziecko2";
        dziecko2.plec = false;
        dziecko2.wiek = 10;

        Ludzie dziecko3 = new Ludzie();
        dziecko3.imie = "dziecko3";
        dziecko3.plec = true;
        dziecko3.wiek = 9;

        Ludzie ojciec = new Ludzie();
        ojciec.imie = "ocjciec";
        ojciec.plec = true;
        ojciec.wiek = 40;
        ojciec.dzieci.add(dziecko1);
        ojciec.dzieci.add(dziecko2);
        ojciec.dzieci.add(dziecko3);

        Ludzie matka = new Ludzie();
        matka.imie = "matka";
        matka.plec = false;
        matka.wiek = 35;
        matka.dzieci.add(dziecko1);
        matka.dzieci.add(dziecko2);
        matka.dzieci.add(dziecko3);

        Ludzie dziadek1 = new Ludzie();
        dziadek1.imie = "dziadek1";
        dziadek1.plec = true;
        dziadek1.wiek = 100;
        dziadek1.dzieci.add(ojciec);

        Ludzie dziadek2 = new Ludzie();
        dziadek2.imie = "dziadek2";
        dziadek2.plec = true;
        dziadek2.wiek = 900;
        dziadek2.dzieci.add(ojciec);

        Ludzie babcia1 = new Ludzie();
        babcia1.imie = "babcia1";
        babcia1.plec = false;
        babcia1.wiek = 90;
        babcia1.dzieci.add(ojciec);

        Ludzie babcia2 = new Ludzie();
        babcia2.imie = "babcia2";
        babcia2.plec = false;
        babcia2.wiek = 80;
        babcia2.dzieci.add(matka);

        System.out.println(dziecko1.toString());
        System.out.println(dziecko2.toString());
        System.out.println(dziecko3.toString());
        System.out.println(ojciec.toString());
        System.out.println(matka.toString());
        System.out.println(dziadek1.toString());
        System.out.println(babcia1.toString());
        System.out.println(dziadek2.toString());
        System.out.println(babcia2.toString());
    }

    public static class Ludzie {
        String imie;
        boolean plec;
        int wiek;
        ArrayList<Ludzie> dzieci = new ArrayList<>();

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i <licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }

}
