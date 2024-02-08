package pl.codegym.task.task18.task1816;

/* 
ABC
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream(args[0]);
        int lettersCounter = 0;

        while (input.available() > 0) {
            int read = input.read();
            if (read > 64 & read < 91 || read > 96 & read < 123){
                lettersCounter++;
            }
        }
        input.close();

        System.out.println(lettersCounter);
    }
}
