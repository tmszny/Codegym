package pl.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimalna liczba bajtów
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        FileInputStream inputStream = new FileInputStream(filePath);

        int min = inputStream.read();

        while (inputStream.available() > 0) {
            int data = inputStream.read();

            if (data < min) {
                min = data;
            }
        }
        inputStream.close();
        System.out.println(min);
    }
}
