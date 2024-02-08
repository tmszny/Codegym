package pl.codegym.task.task16.task1628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // Wczytuje liczbę ciągów
        int count = Integer.parseInt(reader.readLine());

        // Inicjuje wątki
        ReaderThread consoleReader1 = new ReaderThread();
        ReaderThread consoleReader2 = new ReaderThread();
        ReaderThread consoleReader3 = new ReaderThread();

        consoleReader1.start();
        consoleReader2.start();
        consoleReader3.start();

        while (count > readStringCount.get()) {
        }

        consoleReader1.interrupt();
        consoleReader2.interrupt();
        consoleReader3.interrupt();
        System.out.println("#1:" + consoleReader1);
        System.out.println("#2:" + consoleReader2);
        System.out.println("#3:" + consoleReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<>();

        public void run() {
            String string;
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    if ((string = reader.readLine()) != null) {
                        result.add(string);
                        readStringCount.incrementAndGet();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
