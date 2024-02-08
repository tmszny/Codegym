package pl.codegym.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Transakcyjność
*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();
        FileInputStream file1 = new FileInputStream(filePath1);
        FileInputStream file2 = new FileInputStream(filePath2);

        Scanner scanner1 = new Scanner(file1);
        Scanner scanner2 = new Scanner(file2);

        while (scanner1.hasNextLine()) {
            allLines.add(scanner1.nextLine());
        }

        while (scanner2.hasNextLine()) {
            linesForRemoval.add(scanner2.nextLine());
        }

        Solution solution = new Solution();

        solution.joinData();;
        reader.close();
        file1.close();
        file2.close();
        scanner1.close();
        scanner2.close();

    }

    public void joinData() throws  CorruptedDataException {

        boolean CorruptedData = false;

        for (String s : linesForRemoval) {

            if (!allLines.contains(s)){
                CorruptedData = true;
            }
        }

        if (CorruptedData) {
            allLines.clear();
            throw new CorruptedDataException();
        } else {
            for (String s : linesForRemoval) {
                allLines.remove(s);
            }
        }


    }
}
