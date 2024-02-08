package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

    public int wiek;
    public int waga;
    public int sila;

    public Kot() {
    }

    public boolean walka(Kot innyKot) {
        int wiekPlus = this.wiek > innyKot.wiek ? 1 : 0;
        int wagaPlus = this.waga > innyKot.waga ? 1 : 0;
        int silaPlus = this.sila > innyKot.sila ? 1 : 0;

        int wynik = wiekPlus + wagaPlus + silaPlus;
        return wynik > 2;
    }

    public static void main(String[] args) {

    }
}
