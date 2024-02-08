package pl.codegym.task.task04.task0411;

/* 
Pory Roku na Terze
*/

public class Solution {
    public static void main(String[] args) {
        sprawdzPoreRoku(12);
        sprawdzPoreRoku(4);
        sprawdzPoreRoku(7);
        sprawdzPoreRoku(10);
    }

    public static void sprawdzPoreRoku(int miesiac) {
        if (miesiac == 1 || miesiac == 2 || miesiac == 12)
            System.out.println("zima");

        if (miesiac == 3 || miesiac == 4 || miesiac == 5)
            System.out.println("wiosna");

        if (miesiac == 6 || miesiac == 4 || miesiac == 8)
            System.out.println("lato");

        if (miesiac == 9 || miesiac == 10 || miesiac == 11)
            System.out.println("jesień");
    }
}