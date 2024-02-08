package pl.codegym.task.task10.task1011;

/* 
Dużo pieniędzy
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Wcale nie chcę uczyć się Javy. Chcę tylko dużo pieniędzy";

        char[] string = new char[s.length()];
        string = s.toCharArray();

        for (int i = 0; i < string.length; i++){
            if (i == string.length-8) break;
           for (int j = i; j < string.length; j++){
               System.out.print(string[j]);
           }
           System.out.println();
        }

    }

}

