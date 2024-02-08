package pl.codegym.task.task18.task1814;

public class test {

    public static void main(String[] args) {

        String fileName = "plik.txt";

        String[] s = fileName.split("\\.");

        if (s[s.length-1].equals("txt")) {
            System.out.println("działa");
        } else {
            System.out.print("chujnia");
        }
    }
}
