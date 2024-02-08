package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot {

    public String kolor;
    public String imie;
    public int waga;
    public int wiek;
    public String adres;

    public Kot(String imie){
        this.imie = imie;
        this.waga = 10;
        this.kolor = "default";
        this.wiek = 5;
    }

    public Kot(String imie, int waga, int wiek){
        this.imie = imie;
        this.waga = waga;
        this.kolor = "default";
        this.wiek = wiek;
    }

    public Kot(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
        this.kolor ="default";
        this.waga = 10;
    }

    public Kot(int waga, String kolor){
        this.waga = waga;
        this.kolor = kolor;
        this.wiek = 5;
    }

    public Kot(int waga, String kolor, String adres){
        this.waga =waga;
        this.kolor = kolor;
        this.adres = adres;
        this.wiek = 10;
    }
    public static void main(String[] args) {

    }
}
