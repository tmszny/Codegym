package pl.codegym.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {

        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContents();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        String FileName;
        String fileContent = "";

        @Override
        public void setFileName(String fullFileName) {
            FileName = fullFileName;
        }

        @Override
        public void run() {

            try {
                FileInputStream inputFile = new FileInputStream(FileName);
                Scanner scanner = new Scanner(inputFile);
                StringBuilder builder = new StringBuilder();

                while (scanner.hasNextLine()) {
                    builder.append(scanner.nextLine() + " ");
                }

                fileContent = builder.toString();
                scanner.close();
                inputFile.close();

            } catch (Exception e) {
                System.out.println("Plik nie istnieje");
            }
        }

        @Override
        public String getFileContents() {

            return fileContent;
        }


    }
}
