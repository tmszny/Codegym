package pl.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Statyczne koty
*/

public class Kot {
    public static ArrayList<Kot> koty = new ArrayList<>();

    public Kot() {
    }

    public static void main(String[] args) {

        Kot kot1 = new Kot();
        koty.add(kot1);
        Kot kot2 = new Kot();
        koty.add(kot2);
        Kot kot3 = new Kot();
        koty.add(kot3);
        Kot kot4 = new Kot();
        koty.add(kot4);
        Kot kot5 = new Kot();
        koty.add(kot5);
        Kot kot6 = new Kot();
        koty.add(kot6);
        Kot kot7 = new Kot();
        koty.add(kot7);
        Kot kot8 = new Kot();
        koty.add(kot8);
        Kot kot9 = new Kot();
        koty.add(kot9);
        Kot kot10 = new Kot();
        koty.add(kot10);
        printKoty();
    }

    public static void printKoty() {
        for (int i = 0; i < koty.size(); i++) {
            System.out.println(koty.get(i));
        }
    }
}
