package pl.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Matuszny", "Tomasz");
        mapa.put("Nowak", "Kondrad");
        mapa.put("Kowalski", "Jan");
        mapa.put("Robercik", "Tomasz");
        mapa.put("Walo", "Edward");
        mapa.put("Piast", "Tomasz");
        mapa.put("Pop", "Igggy");
        mapa.put("Grubas", "Walaszek");
        mapa.put("Matusznuy", "Józef");
        mapa.put("Matusznty", "Leszek");

        return mapa;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        //HashMap<String, String> copy = new HashMap<>(map);
        int licznikImion = 0;
        for (Map.Entry<String, String> para: map.entrySet()) {
            if (imie.equals(para.getValue())){
                licznikImion++;
            }
        }
      return  licznikImion;
    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        int licznikNazwisk = 0;
        for (Map.Entry<String, String> para: map.entrySet()) {
            if (nazwisko.equals(para.getKey())){
                licznikNazwisk++;
            }
        }
        return  licznikNazwisk;

    }

    public static void main(String[] args) {

    }
}
