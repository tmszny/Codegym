package pl.codegym.task.task19.task1907;

/* 
Liczenie słów
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        reader.close();
        FileReader file = new FileReader(filePath);
        StringBuilder builder = new StringBuilder();
        int counter = 0;

        while (file.ready()) {
            char letter = (char) file.read();

            if (Character.isLetter(letter) ) {
                builder.append(letter);
            } else {
                String result = builder.toString();
                builder.setLength(0);
                if (result.equals("świat")){
                    counter++;
                }
            }
        }
        file.close();
        System.out.println(counter);
    }
}
