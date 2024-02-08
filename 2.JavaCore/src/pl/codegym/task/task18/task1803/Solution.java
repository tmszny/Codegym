package pl.codegym.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Najczęściej występujące bajty
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filePath = reader.readLine();

        FileInputStream input = new FileInputStream(filePath);
        byte[] byteArray = new byte[input.available()];
        input.read(byteArray);
        input.close();

        HashMap<Byte, Integer> map = new HashMap<>();

        for (byte b : byteArray) {
            if (map.containsKey(b)) {
                int value = map.get(b);
                map.put(b, ++value);
            } else {
                map.put(b, 1);
            }
        }

        int maxDuplicate = 0;
        for (int byteCount : map.values()) {
            if (byteCount > maxDuplicate) {
                maxDuplicate = byteCount;
            }
        }

        for (Map.Entry<Byte, Integer> p : map.entrySet()) {
            if (p.getValue() == maxDuplicate) {
                System.out.print(p.getKey() + " ");
            }
        }
    }
}
