package pl.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Modyfikatory statyczne: część 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static{
        labels.put((double) 1, "jeden");
        labels.put((double) 2, "dwa");
        labels.put((double) 3, "trzy");
        labels.put((double) 4, "cztery");
        labels.put((double) 5, "piec");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
