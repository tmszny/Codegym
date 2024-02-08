package pl.codegym.task.task04.task0409;

/* 
Najbliżej 10
*/

public class Solution {
    public static void main(String[] args) {
        wyswietlNajblizszaDziesiatce(8, 11);
        wyswietlNajblizszaDziesiatce(7, 14);
    }

    public static void wyswietlNajblizszaDziesiatce(int a, int b) {
        int a_low = a - 10;
        a_low = abs(a_low);
        int b_low = b - 10;
        b_low = abs(b_low);

        if (a_low < b_low)
            System.out.println(a);
        if (b_low < a_low)
            System.out.println(b);
        if (a_low == b_low)
            System.out.println(a);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}