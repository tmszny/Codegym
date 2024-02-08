package pl.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Samogłoski i spółgłoski
*/

public class Solution {
    public static char[] samogloski = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ciag = reader.readLine();
        int dlugosc = ciag.length();
        char[] ciagTablica = new char[dlugosc];
        ciagTablica = ciag.toCharArray();
        String string1 = "";
        String string2 = "";

        for (char a : ciagTablica){
            boolean samogloska = isSamogloska(a);

            if (Character.isSpaceChar(a)){
                continue;
            }
            else if (samogloska){
                string1 = string1 + a + " ";
            }
            else{
                string2 = string2 + a + " ";
            }
        }

        System.out.println(string1);
        System.out.println(string2);
    }

    // Ta metoda sprawdza, czy litera jest samogłoską
    public static boolean isSamogloska(char c) {
        c = Character.toLowerCase(c);  // Konwertuje na małe litery

        for (char d : samogloski)   // Szuka samogłosek w tablicy
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}