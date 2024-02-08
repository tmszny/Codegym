package pl.codegym.task.task18.task1821;

/* 
Częstotliwość występowania symboli
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream(args[0]);
        int[] signs = new int[256];

        while (input.available() > 0) {
            signs[input.read()]++;
        }

        input.close();

        for (int i = 0; i < 256; i++) {
            if (signs[i] != 0) {
                System.out.println((char)i + " " + signs[i]);
            }
        }
    }
}
