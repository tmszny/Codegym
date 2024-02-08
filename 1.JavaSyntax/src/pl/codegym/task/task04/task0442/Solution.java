package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0;

    for(Boolean warunek = false; !warunek;) {
        int a = Integer.parseInt(reader.readLine());
        sum += a;
        if (a == -1){
            System.out.println(sum);
            warunek = true;
        }
    }
    }
}
