package pl.codegym.task.task18.task1808;

/* 
Dzielenie pliku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();
        String filePathe3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(filePath1);
        FileOutputStream file2 = new FileOutputStream(filePath2);
        FileOutputStream file3 = new FileOutputStream(filePathe3);

        int byteNumber = file1.available();

        while (file1.available() > 0) {
            if (file1.available() > (byteNumber/2)) {
                int buffer = file1.read();
                file2.write(buffer);
            } else {
                int buffer = file1.read();
                file3.write(buffer);
            }
        }

        file1.close();
        file2.close();
        file3.close();

        System.out.println(byteNumber);
    }
}
