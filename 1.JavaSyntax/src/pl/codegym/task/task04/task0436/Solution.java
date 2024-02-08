package pl.codegym.task.task04.task0436;


/* 
Rysowanie prostokąta
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int j;
        int i;

        for (i = m; i > 0; i--){
            for(j = n; j > 0; j--){
                System.out.print("8");
            }
            System.out.println();

        }

    }
}
