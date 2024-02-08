package pl.codegym.task.task01.task0132;

/* 
Suma cyfr trzycyfrowej liczby
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumaCyfrLiczby(546));
    }

    public static int sumaCyfrLiczby(int liczba) {
        int wynik = 0;
       // System.out.println(liczba%10);
        while (liczba != 0) {
            wynik += liczba%10;
            liczba /= 10;
        }
        return wynik;
    }
}