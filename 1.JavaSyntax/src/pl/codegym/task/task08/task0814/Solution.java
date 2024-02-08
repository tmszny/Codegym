package pl.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {
    public static HashSet<Integer> utworzSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(2);
        set.add(66);
        set.add(15);
        set.add(7);
        set.add(16);
        set.add(6);
        set.add(11);
        set.add(86);
        set.add(153);
        set.add(0);
        set.add(18);
        set.add(9);
        set.add(123);
        set.add(770);
        set.add(84);
        set.add(46);
        set.add(33);
        set.add(19);
        set.add(5);

        return set;
        }


    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        HashSet<Integer> copy = new HashSet<>(set);
        for (Integer i : copy) {
            if (i > 10) {
                set.remove(i);
            }
        }
        return set;

    }



    public static void main(String[] args) {
        HashSet<Integer> setList = utworzSet();

        for (Integer i : usunLiczbyWiekszeNiz10(setList)) {
            System.out.println(i);
        }
    }
}
