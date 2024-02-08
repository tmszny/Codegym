package pl.codegym.task.task05.task0520;

/* 
Utwórz klasę Prostokat
*/

public class Prostokat {

    public int gora;
    public int lewy;
    public int szerokosc;
    public int wysokosc;

    public Prostokat(int gora, int lewy, int szerokosc, int wysokosc){
        this.gora = gora;
        this.szerokosc = szerokosc;
        this.lewy = lewy;
        this.wysokosc = wysokosc;
    }

    public Prostokat(int gora, int lewy, int szerokosc){
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = szerokosc;
    }

    public Prostokat(Prostokat prostokat){
        this.gora = prostokat.gora;
        this.lewy = prostokat.lewy;
        this.wysokosc = prostokat.wysokosc;
        this.szerokosc = prostokat.szerokosc;
    }

    public Prostokat(int szerokosc, int wysokosc){
        this.szerokosc = szerokosc;
        this.wysokosc =  wysokosc;
    }
    public static void main(String[] args) {

    }
}
