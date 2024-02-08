package pl.codegym.task.task03.task0312;

/* 
Konwersja czasu
*/

public class Solution {

    public static int konwertujNaSekundy(int godzina){
        return godzina*60*60;
    }

    public static void main(String[] args) {
        System.out.println(konwertujNaSekundy(10));
        System.out.println(konwertujNaSekundy(1));
    }
}
