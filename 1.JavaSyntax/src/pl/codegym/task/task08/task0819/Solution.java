package pl.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Koci Set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Kot> kopia = new HashSet<>(koty);
        int i = 0;

        for (Kot kot : kopia) {
            if (i == 1){
                break;
            }
            koty.remove(kot);
            i++;
        }

        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> setKotow = new HashSet<>();

        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();
        
        setKotow.add(kot1);
        setKotow.add(kot2);
        setKotow.add(kot3);

        return setKotow;
    }

    public static void printKoty(Set<Kot> koty) {
        for (Kot kot : koty){
        System.out.println(kot.toString());
        }
    }

    public static class Kot{

    }
}
