package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzMapLudzi();
        printMapLudzi(mapa);
    }

    public static Map<String, String> utworzMapLudzi() {
        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("Jan", "Kowalski");
        mapa.put("Marek", "Kowalski");
        mapa.put("Marek", "Kowalski");
        mapa.put("Robert", "Kowalski");
        mapa.put("Jan", "Kowalski");
        mapa.put("Jan", "Kowalski");
        mapa.put("Jan", "Kowalski");
        mapa.put("Jan", "Kowalski");
        mapa.put("Jan", "Kowalski");
        mapa.put("Jan", "Kowalski");
        mapa.put("Jan", "Kowalski");

        return mapa;
    }

    public static void printMapLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
