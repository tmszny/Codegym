package pl.codegym.task.task18.task1826;

/* 
Szyfrowanie
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream(args[1]);
        FileOutputStream output = new FileOutputStream(args[2]);

        if (args[0].equals("-e")) {
            while (input.available() > 0) {
                output.write(input.read() + 2);
            }
        } else if (args[0].equals("-d")){
            while (input.available() > 0) {
                output.write(input.read() - 2);
            }
        }

        input.close();
        output.close();

    }

}
