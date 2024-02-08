package pl.codegym.task.task04.task0434;


/* 
Tabliczka mnożenia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1;
        int j = 1;

        while (j <= 10){
            while (i <= 10){
                System.out.print(i*j + " ");
                i++;
            }
            System.out.println();
            j++;
            i=1;
        }

    }
}
