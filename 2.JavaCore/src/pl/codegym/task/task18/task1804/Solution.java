package pl.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Najrzadziej występujące bajty
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();

        FileInputStream input = new FileInputStream(filePath);
        byte[] byteArray = new byte[256];
        while (input.available() > 0) {
            byteArray[input.read()]++;
        }
        input.close();
        ArrayList<Byte> result = new ArrayList<>();
        for (byte b : byteArray) {
            if (b != 0) {
                result.add(b);
            }
        }
        Collections.sort(result);
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray[i] == result.get(0)) {
                System.out.print(i + " ");
            }
        }




    }
}
