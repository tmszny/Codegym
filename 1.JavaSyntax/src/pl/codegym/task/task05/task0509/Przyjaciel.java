package pl.codegym.task.task05.task0509;

/* 
Utwórz klasę Przyjaciel
*/

public class Przyjaciel {

    public String imie;
    public int wiek;
    public char plec;


    public void inicjalizuj(String imie){
        this.imie = imie;
    }

    public void inicjalizuj(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }

    public void inicjalizuj(String imie, int wiek, char plec){
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;
    }

    public static void main(String[] args) {


    }
}
