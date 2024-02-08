package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    String imie;
    int wiek;
    int waga;
    String adres;
    String kolor;


    public void inicjalizuj(String imie) {
        this.imie = imie;
        this.wiek = 1;
        this.waga = 1;
        this.kolor = "czarny";
    }

    public void inicjalizuj(String imie, int waga, int wiek) {
        this.imie = imie;
        this.waga = waga;
        this.wiek = wiek;
        this.kolor = "standardowy";
    }

    public void inicjalizuj(String imie, int wiek){
        this.imie = imie;
        this.waga = 1;
        this.wiek = wiek;
        this.kolor = "standardowy";
    }

    public void inicjalizuj(int waga, String kolor){
        this.waga = waga;
        this.wiek = 1;
        this.kolor = kolor;
    }

    public void inicjalizuj(int waga, String kolor, String adres){
        this.waga = waga;
        this.wiek = 1;
        this.kolor = kolor;
        this.adres = adres;
    }


    public static void main(String[] args) {
        }


}
