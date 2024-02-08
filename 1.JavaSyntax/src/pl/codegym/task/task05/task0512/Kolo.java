package pl.codegym.task.task05.task0512;

/* 
Utwórz klasę Kolo
*/

public class Kolo {

    int srodekX;
    int srodekY;
    int promien;
    int szerokosc;
    int kolor;

    public void inicjalizuj(int srodekX, int srodekY, int promien){
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = 1;
        this.kolor = 1;
    }
    public void inicjalizuj(int srodekX, int srodekY, int promien, int szerokosc){
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
        this.kolor = 1;
    }
    public void inicjalizuj(int srodekX, int srodekY, int promien, int szerokosc, int kolor){
        this.srodekX = srodekX;
        this.srodekY = srodekY;
        this.promien = promien;
        this.szerokosc = szerokosc;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
