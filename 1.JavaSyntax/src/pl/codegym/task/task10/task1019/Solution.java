package pl.codegym.task.task10.task1019;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* 
Funkcjonalność to nie wszystko!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> mapa = new HashMap<>();
        int id = 0;
        int idKeylost = 0;
        boolean Keylost = false;

            while (true) {
                try {
                    String idS = reader.readLine();
                    if (idS.isEmpty()){
                        break;
                    }else{
                        id = Integer.parseInt(idS);
                    }
                    String imie = reader.readLine();
                    if (imie.isEmpty()){
                        idKeylost = id;
                        Keylost = true;
                        break;
                    }

                    if (!mapa.containsKey(imie)) {
                        mapa.put(imie, id);}
                }catch (Exception e) {
                    break;

            }
            }
            for(Map.Entry<String, Integer> para : mapa.entrySet()){
                System.out.println(para.getValue() + " " + para.getKey());
            }
            if (Keylost) System.out.println(idKeylost);
        }}


