package pl.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maksymalna liczba bajtów
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream input = new FileInputStream(reader.readLine());
        int byteMax = 0;

        while (input.available() > 0) {
            int currByte = input.read();
            if (currByte > byteMax) byteMax = currByte;

        }

        System.out.println(byteMax);
        input.close();
    }
}
