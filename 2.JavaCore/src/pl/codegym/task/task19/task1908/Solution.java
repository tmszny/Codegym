package pl.codegym.task.task19.task1908;

/* 
Wybieranie numerów
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
        StringBuilder stringBuilder = new StringBuilder();

        while(input.ready()) {
            int data = input.read();
            stringBuilder.append((char)data);
        }
        input.close();

        String[] dataArray = stringBuilder.toString().split(" ");

        for (String s : dataArray) {
            try {
                output.write(String.valueOf(Integer.parseInt(s)));
                output.write(" ");
            } catch (Exception e) {
            }
        }
        output.close();
    }
}
