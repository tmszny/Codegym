package pl.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Różne metody dla różnych typów
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (true) {

            s = reader.readLine();

            if (s.equals("exit")){
                break;
            } else if (s.contains(".")) {

                try{
                    double d = Double.parseDouble(s);
                    print(d);
                } catch (NumberFormatException e){
                    print(s);
                }
            }else{

                try {
                    int i = Integer.parseInt(s);

                    if (i > 0 && i < 128){
                        print((short) i);
                    }else {
                        print(i);
                    }
                }catch (NumberFormatException e){
                    print(s);
                }
            }
        }
        }


    public static void print(Double value) {
        System.out.println("To jest Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("To jest String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("To jest liczba całkowita typu short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("To jest liczba całkowita typu Integer. Value: " + value);
    }
}
