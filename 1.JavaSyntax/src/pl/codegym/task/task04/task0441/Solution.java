package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a <= b & a >= c) System.out.println(a);
        else if (a >= b & a <= c) System.out.println(a);
        else if (b <= a && b >= c) System.out.println(b);
        else if (b >= a && b <= c) System.out.println(b);
        else if (c <= a && c >= b) System.out.println(c);
        else if (c >= a && c <= b) System.out.println(c);
    }
}
