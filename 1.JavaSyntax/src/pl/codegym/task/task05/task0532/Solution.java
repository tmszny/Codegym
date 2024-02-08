package pl.codegym.task.task05.task0532;

import java.io.*;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        if (n > 0) {

            int maksimum = Integer.parseInt(reader.readLine());

            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(reader.readLine());
                if (maksimum <= a) {
                    maksimum = a;
                }
            }

            System.out.println(maksimum);
        }
    }
}
