package pl.codegym.task.task05.task0519;

/* 
Chodzenie w kółko
*/

public class Kolo {

    public int srodekX;
    public int srodekY;
    public int promien;
    public int szerokosc;
    public int kolor;

    public Kolo(int srodekX, int srodekY, int promien){
        this.promien = promien;
        this.srodekX = srodekX;
        this.srodekY = srodekY;
    }

    public Kolo(int srodekX, int srodekY, int promien, int szerokosc){
        this.srodekY = srodekY;
        this.srodekX = srodekX;
        this.promien = promien;
        this.szerokosc =szerokosc;
    }

    public Kolo(int srodekX, int srodekY, int promien, int szerokosc,int kolor){
        this.srodekY = srodekY;
        this.srodekX = srodekX;
        this.promien = promien;
        this.szerokosc = szerokosc;
        this.kolor = kolor;
    }

    public static void main(String[] args) {

    }
}
