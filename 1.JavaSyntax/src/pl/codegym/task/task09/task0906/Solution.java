package pl.codegym.task.task09.task0906;

/* 
Logowanie śladów stosu
*/

public class Solution {
    public static void main(String[] args) {
        log("W metodzie main");
    }

    public static void log(String s) {
        String nazwaKlasy = Thread.currentThread().getStackTrace()[2].getClassName();
        String nazwaMetody = Thread.currentThread().getStackTrace()[2].getMethodName();

        System.out.println(nazwaKlasy + ": " + nazwaMetody + ": "  + s);
    }
}
