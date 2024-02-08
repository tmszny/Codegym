package pl.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread {

        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class Thread2 extends Thread {

        @Override
        public void run() {
            try {
                while (true){
                    sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {

        @Override
        public void run() {

            try {
                while (true) {
                    System.out.println("Hurra");
                    sleep(500);
                }
            } catch (Exception e) {
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        boolean stop = false;

        @Override
        public void run() {

            while (!stop) {
            }
        }

        @Override
        public void showWarning() {
            stop = true;
        }
    }

    public static class Thread5 extends Thread {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum = 0;

        @Override
        public void run() {

            while (true) {

                try {
                    s = reader.readLine();
                    if (s.equals("N")) break;
                    sum += Integer.parseInt(s);
                } catch (IOException e) {
                }
            }

            System.out.println(sum);
        }
    }
}