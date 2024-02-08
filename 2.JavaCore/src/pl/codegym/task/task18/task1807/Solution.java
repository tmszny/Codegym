package pl.codegym.task.task18.task1807;

/* 
Liczenie przecinków
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        FileInputStream input = new FileInputStream(filePath);
        byte[] byteArray = new byte[input.available()];

        if (input.available() > 0) {
            input.read(byteArray);
        }

        input.close();

        int dotCounter = 0;

        for (byte b : byteArray) {
            if (b == 44) {
                dotCounter++;
            }
        }

        System.out.println(dotCounter);

    }
}
