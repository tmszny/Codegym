package pl.codegym.task.task04.task0410;

/* 
Śmiało, szczęśliwa siódemko!
*/

public class Solution {
    public static void main(String[] args) {
        sprawdzPrzedzial(60);
        sprawdzPrzedzial(112);
        sprawdzPrzedzial(10);
    }

    public static void sprawdzPrzedzial(int a) {
        if (a <= 100 && a >= 50)
            System.out.println("Liczba " + a + " znajduje się w tym przedziale.");
        else
            System.out.println("Liczba " + a + " nie znajduje się w tym przedziale.");

    }
}