package pl.codegym.task.task05.task0511;

/* 
Utwórz klasę Pies
*/

public class Pies {

    public String imie;
    public int wzrost;
    String kolor;

    public void inicjalizuj(String imie){
        this.imie = imie;
        this.wzrost = 170;
        this.kolor = "czarny";
    }

    public void inicjalizuj(String imie, int wzrost){
        this.imie = imie;
        this.wzrost = wzrost;
        this.kolor = "czarny";
    }

    public void inicjalizuj(String imie, int wzrost, String kolor){
        this.imie = imie;
        this.wzrost = wzrost;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
