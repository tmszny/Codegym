package pl.codegym.task.task18.task1819;

/* 
Łączenie plików
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();

        FileInputStream fileInput1 = new FileInputStream(filePath1);

        byte[] file1Bytes = new byte[fileInput1.available()];
        fileInput1.read(file1Bytes);
        fileInput1.close();

        FileOutputStream file1Output = new FileOutputStream(filePath1);
        FileInputStream fileInput2 = new FileInputStream(filePath2);

        while (fileInput2.available() > 0) {
            int data = fileInput2.read();
            file1Output.write(data);
        }

        for (int data : file1Bytes) {
            file1Output.write(data);
        }

        file1Output.close();
        fileInput2.close();
    }
}

