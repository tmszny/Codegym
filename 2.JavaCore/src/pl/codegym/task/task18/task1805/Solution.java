package pl.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* 
Sortowanie bajtów
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();
        HashSet<Integer> set = new HashSet<>();
        FileInputStream input = new FileInputStream(filePath);

        while (input.available() > 0) {
            set.add(input.read());
        }

        input.close();
        ArrayList<Integer> result = new ArrayList<>();

        for (int a : set) {
            result.add(a);
        }

        Collections.sort(result);

        for (int a : result) {
            System.out.print(a + " ");
        }
    }
}
