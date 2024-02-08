package pl.codegym.task.task04.task0433;


/* 
Zobaczyć dolary w przyszłości
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 9;
        int j = 10;

        while (j > 0) {
            while (i > 0) {
                System.out.print("$");
                i--;
            }
            System.out.println("$");
            i = 9;
            j--;
        }
    }
}
