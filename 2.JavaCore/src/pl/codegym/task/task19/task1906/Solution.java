package pl.codegym.task.task19.task1906;

/* 
Znaki parzyste
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader readFile = new FileReader(file1);
        FileWriter writeFile = new FileWriter(file2);

        int signNumber = 1;

        while(readFile.ready()) {
            int data = readFile.read();
            if (signNumber % 2 == 0) {
                writeFile.write(data);
            }
            signNumber++;
        }

        readFile.close();
        writeFile.close();
    }
}
