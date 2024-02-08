package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Tylko dla bogaczy
*/

public class Solution {
    public static HashMap<String, Integer> utworzMap() {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Kowalski1", 1000);
        mapa.put("Kowalski2", 1500);
        mapa.put("Kowalski3", 750);
        mapa.put("Kowalski4", 800);
        mapa.put("Kowalski5", 2000);
        mapa.put("Kowalski6", 500);
        mapa.put("Kowalski7", 1500);
        mapa.put("Kowalski8", 50);
        mapa.put("Kowalski9", 1500);
        mapa.put("Kowalski10", 1);
        return mapa;
    }

    public static void usunPozycjeZmap(HashMap<String, Integer> map) {
        HashMap<String, Integer> kopia = new HashMap<>(map);

        for (Map.Entry<String, Integer> para : kopia.entrySet()) {
            if (para.getValue() < 500){
                map.remove(para.getKey());
            }

        }
    }

    public static void main(String[] args) {
    }
}