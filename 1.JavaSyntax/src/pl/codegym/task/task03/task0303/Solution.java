package pl.codegym.task.task03.task0303;

/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(konwertujEurNaUsd(10, 4.11));
        System.out.println(konwertujEurNaUsd(2137, 4.13));
    }

    public static double konwertujEurNaUsd(int eur, double kursWymiany) {
        return eur * kursWymiany;
    }
}
