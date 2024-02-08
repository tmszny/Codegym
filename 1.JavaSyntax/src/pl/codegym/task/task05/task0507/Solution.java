package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        double srednia = 0;
        double i = 0;
        int a1 = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int a = Integer.parseInt(reader.readLine());

            if (a == - 1){
                System.out.println(srednia);
                break;
            }

            a1 += a;
            i++;
            srednia = a1 / i;
        }
    }
}

