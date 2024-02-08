package pl.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> wynik = new HashSet<Kot>();

        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());
        wynik.add(new Kot());

        return wynik;
    }

    public static Set<Pies> utworzPsy() {
        HashSet<Pies> wynik = new HashSet<>();

        wynik.add(new Pies());
        wynik.add(new Pies());
        wynik.add(new Pies());

        return wynik;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        HashSet<Object> wynik = new HashSet<>();

        wynik.addAll(koty);
        wynik.addAll(psy);

        return wynik;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        for (Kot kot : koty) {
            zwierzeta.remove(kot);
        }
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        for (Object zwierze : zwierzeta) {
            System.out.println(zwierze);
        };
    }

    public static class Kot{

    }

    public static class Pies{

    }
}
