package pl.codegym.task.task18.task1817;

/* 
Spacje
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream(args[0]);

        int spaceCounter = 0;
        int singCounter = 0;

        while (input.available() > 0) {
            int sign = input.read();
            singCounter++;

            if (sign == 32) {
                spaceCounter++;
            }
        }
        input.close();

        double ratio = (double)spaceCounter / (double)singCounter * 100.0;

        System.out.println(String.format("%.2f", ratio));
    }


}
