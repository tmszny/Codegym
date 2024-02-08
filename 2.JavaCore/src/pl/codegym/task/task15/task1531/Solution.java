package pl.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Silnia
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        if (input < 0) {
            System.out.println(0);
        } else if (input <= 150) {
            System.out.println(factorial(input));
        }


    }

    public static String factorial(int n) {

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            Integer j = i;
            factorial = factorial.multiply(new BigInteger(j.toString()));
        }

        return factorial.toString();
    }
}
