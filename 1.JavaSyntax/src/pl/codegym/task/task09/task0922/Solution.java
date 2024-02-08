package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dataS = reader.readLine();

        Date data = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(dataS);

        SimpleDateFormat format = new SimpleDateFormat("d MMM yyyy", new Locale("pl"));

        String dataSS = (format.format(data));

        System.out.println(dataSS.toUpperCase());
    }
}
