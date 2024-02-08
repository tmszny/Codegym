package pl.codegym.task.task18.task1820;

/* 
Zaokrąglanie liczb
*/

import java.io.*;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();

        FileInputStream input = new FileInputStream(filePath1);
        FileOutputStream output = new FileOutputStream(filePath2);
        Scanner scanner = new Scanner(input);

        while (scanner.hasNextDouble()) {

            double wartosc = scanner.nextDouble();
            //System.out.println(wartosc);

            String result = String.valueOf(zaokraglanie(wartosc));
            output.write(result.getBytes());
            output.write(32);
        }

        input.close();
        output.close();
        scanner.close();

    }

    public static int zaokraglanie(double d) {
        int i = ((int)  d) * 100;
        int dI = (int) (d * 100);

        double reszta = abs(dI - i);
        int wynik = 0;

        if (i < 0) {
            if (reszta < 51 ) {
                wynik = i/100;
            } else {
                wynik = i/100 - 1;
            }
        } else if (i > 0) {
            if (reszta <= 50) {
                wynik = i/100;
            } else {
                wynik = i/100 + 1;
            }
        }
        return wynik;
    }
}
