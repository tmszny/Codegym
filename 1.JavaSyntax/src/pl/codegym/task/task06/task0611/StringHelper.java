package pl.codegym.task.task06.task0611;

/* 
Klasa StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String wynik = "";
        for(int i = 0; i < 5; i++) {
            wynik = wynik + s;
        }
            return wynik;
    }

    public static String multiply(String s, int licznik) {
        String wynik = "";
        for(int i = 0; i < licznik; i++){
            wynik = wynik + s;
        }
        return wynik;
    }

    public static void main(String[] args) {

    }
}
