package pl.codegym.task.task04.task0418;

/* 
Mniejsza z dwóch liczb
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(read.readLine());
        int b = Integer.parseInt(read.readLine());

        if (a < b)
            System.out.println(a);
        else if (a > b)
            System.out.println(b);
        else
            System.out.println(a);
    }
}