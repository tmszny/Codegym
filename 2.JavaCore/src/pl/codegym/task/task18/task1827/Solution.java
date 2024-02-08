package pl.codegym.task.task18.task1827;

/* 
Ceny
*/

import javax.print.DocFlavor;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        if (args.length == 0) return;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        String[] data = args;

        if (data[0].equals("-c")) {


            FileInputStream input = new FileInputStream(filePath);
            Scanner scanner = new Scanner(input);

            String lastLine = "";
            int lastID;

            if (scanner.hasNextLine()) {
                while (scanner.hasNextLine()) {
                    lastLine = scanner.nextLine();
                }

                char[] lastLineChars = lastLine.toCharArray();
                StringBuilder builder = new StringBuilder();

                for (int i = 0; i < 8; i++) {
                    if (!(lastLineChars[i] == ' ')) {
                        builder.append(lastLineChars[i]);
                    }
                }

                lastID = Integer.parseInt(builder.toString());
            } else {
                lastID = 0;
            }
            input.close();
            scanner.close();
            reader.close();

            int newID = lastID + 1;
            String newIdString = String.valueOf(newID);
            char[] idChar = newIdString.toCharArray();
            Character[] idArray = new Character[8];

            Arrays.fill(idArray, ' ');

            for (int i = 0; i < idChar.length; i++) {
                idArray[i] = idChar[i];
            }

            Character[] productNameArray = new Character[30];
            char[] productNameChar = data[1].toCharArray();

            Arrays.fill(productNameArray, ' ');

            for (int i = 0; i < productNameChar.length; i++) {
                productNameArray[i] = productNameChar[i];
            }

            Character[] priceArray = new Character[8];
            char[] priceChar = data[2].toCharArray();

            Arrays.fill(priceArray, ' ');

            for (int i = 0; i < priceChar.length; i++) {
                priceArray[i] = priceChar[i];
            }

            Character[] quantityArray = new Character[4];
            char[] quantityChar = data[3].toCharArray();

            Arrays.fill(quantityArray, ' ');

            for (int i = 0; i < quantityChar.length; i++) {
                quantityArray[i] = quantityChar[i];
            }

            Character[] finalArray = new Character[50];

            for (int i = 0; i < 8; i++) {
                finalArray[i] = idArray[i];
            }

            for (int i = 8; i < 38; i++) {
                finalArray[i] = productNameArray[i - 8];
            }

            for (int i = 38; i < 46; i++) {
                finalArray[i] = priceArray[i - 38];
            }

            for (int i = 46; i < 50; i++) {
                finalArray[i] = quantityArray[i - 46];
            }

            for (Character c : finalArray) {
                System.out.print(c);
            }

            Writer output = new BufferedWriter(new FileWriter(filePath, true));

            for (Character c : finalArray) {
                output.write(c);
            }

            output.write(10);
            output.close();
        }
    }
}
