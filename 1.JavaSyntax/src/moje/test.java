package moje;

public class test {

    public static void main(String[] args) {
        String data = "135324A+122";
        String result = data.replaceAll("\\D", "");

        System.out.println(result);
    }
}
