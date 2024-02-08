package pl.codegym.task.task18.task1822;

/* 
Wyszukiwanie danych wewnątrz pliku
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Objects;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        FileInputStream input = new FileInputStream(filePath);
        Scanner scanner = new Scanner(input);

        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] temp = line.split(" ");
            if (Objects.equals(temp[0], args[0])) {
                System.out.println(line);
            }
        }
        input.close();
        scanner.close();
    }
}
