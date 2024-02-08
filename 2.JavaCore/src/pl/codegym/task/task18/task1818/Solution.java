package pl.codegym.task.task18.task1818;

/* 
Dwa w jednym
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();
        String filePath3 = reader.readLine();

        FileOutputStream file1 = new FileOutputStream(filePath1);
        FileInputStream file2 = new FileInputStream(filePath2);
        FileInputStream file3 = new FileInputStream(filePath3);

        while(file2.available() > 0) {
            int data = file2.read();
            file1.write(data);
        }
        file2.close();

        while(file3.available() > 0) {
            int data = file3.read();
            file1.write(data);
        }
        file1.close();
        file3.close();
    }
}
