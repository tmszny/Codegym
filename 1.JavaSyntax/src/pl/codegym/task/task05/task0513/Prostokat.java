package pl.codegym.task.task05.task0513;

/* 
Stwórzmy sobie prostokąt
*/

public class Prostokat {
    public int gora;
    public int lewy;
    public int szerokosc;
    public int wysokosc;

    public void inicjalizuj(Prostokat prostokat){
        this.gora = prostokat.gora;
        this.lewy = prostokat.lewy;;
        this.szerokosc = prostokat.szerokosc;
        this.wysokosc = prostokat.wysokosc;

    }

    public void inicjalizuj(int gora, int lewy, int szerokosc, int wysokosc){
        this.gora = gora;
        this.lewy = lewy;;
        this.szerokosc = szerokosc;
        this.wysokosc = lewy;

    }

    public void inicjalizuj(int gora, int lewy, int szerokosc) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = szerokosc;
        this.wysokosc = szerokosc;

    }

    public void inicjalizuj(int gora, int lewy) {
        this.gora = gora;
        this.lewy = lewy;
        this.szerokosc = 0;
        this.wysokosc = 0;

    }
        public static void main(String[] args) {

    }
}
