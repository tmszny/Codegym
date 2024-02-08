package pl.codegym.task.task18.task1809;

/* 
Odwracanie pliku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();
        FileInputStream input = new FileInputStream(filePath1);
        FileOutputStream output = new FileOutputStream(filePath2);

        byte[] bufforArray = new byte[input.available()];

        if (input.available() > 0) {
            input.read(bufforArray);
        }

        for (int i = bufforArray.length - 1; i > -1; i--) {
            output.write(bufforArray[i]);
        }

        input.close();
        output.close();
    }
}
