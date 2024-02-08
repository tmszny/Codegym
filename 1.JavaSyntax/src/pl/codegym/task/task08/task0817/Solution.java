package pl.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Kowalski1", "Jan");
        map.put("Kowalski2", "Jan");
        map.put("Kowalski3", "Roman");
        map.put("Kowalski4", "Marek");
        map.put("Kowalski5", "Andrzej");
        map.put("Kowalski6", "Marek");
        map.put("Kowalski7", "Tomasz");
        map.put("Kowalski8", "Jan");
        map.put("Kowalski9", "Kamil");
        map.put("Kowalski10", "Waldemar");
        return map;
    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        HashMap<String, String> kopia = new HashMap<>(mapa);

        for (Map.Entry<String, String> para : mapa.entrySet()) {

            String imie = para.getValue();
            String nazwisko = para.getKey();
            kopia.remove(para.getKey());

            if (kopia.containsValue(imie)){
                usunElementZMapPoWartosci(kopia, imie);
                }
            else {
                kopia.put(nazwisko, imie);
            }
            }
        mapa.clear();
        mapa.putAll(kopia);


        }



    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc)) {
                mapa.remove(para.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
