package pl.codegym.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Praca z datami
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDataNieparzysta("MAY 1 2013"));
    }

    public static boolean isDataNieparzysta(String date) throws ParseException {
        boolean parzystosc;
        Date data = new SimpleDateFormat("MMM dd yy", Locale.ENGLISH).parse(date);

        Date poczatekRoku = new Date();
        poczatekRoku.setHours(0);
        poczatekRoku.setMinutes(0);
        poczatekRoku.setSeconds(0);
        poczatekRoku.setDate(1);
        poczatekRoku.setMonth(0);
        poczatekRoku.setYear(data.getYear());

        long roznicawms = data.getTime() - poczatekRoku.getTime();
        long dni = roznicawms / 3600000 / 24;

        if (dni % 2 == 0){
            parzystosc = false;
        }else {
            parzystosc = true;
        }

        return parzystosc;
    }
}