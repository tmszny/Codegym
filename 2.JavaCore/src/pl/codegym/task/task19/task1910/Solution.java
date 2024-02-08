package pl.codegym.task.task19.task1910;

/* 
Interpunkcja
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();
        reader.close();

        BufferedReader input = new BufferedReader(new FileReader(filePath1));
        BufferedWriter output = new BufferedWriter(new FileWriter(filePath2));

        while (input.ready()) {
            int data = input.read();

            if (Character.isLetterOrDigit(data) || Character.isSpaceChar(data)) {
                output.write(data);
            }
        }
        input.close();
        output.close();
    }
}
