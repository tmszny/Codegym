package pl.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Praktyka z blokami statycznymi
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String vehicle = reader.readLine();

        if (vehicle.equals("helikopter")) {
            result = new Helicopter();
        } else if (vehicle.equals("samolot")) {

            int passengerNumber = Integer.parseInt(reader.readLine());
            result = new Plane(passengerNumber);
        }

        reader.close();
    }
}
