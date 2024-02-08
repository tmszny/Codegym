package pl.codegym.task.task05.task0522;

/* 
Maksimum konstruktorów
*/

public class Kolo {

    public double x;
    public double y;
    public double promien;

    public Kolo() {

    }

    public Kolo(int x, int y, int promien){
        this.promien = promien;
        this.x = x;
        this.y = y;
    }

    public Kolo(int x, int promien){
        this.x = x;
        this.y = x;
        this.promien =promien;
    }

    public Kolo(int x){
        this.x = x;
        this.y = 10;
        this.promien = 10;
    }

    public static void main(String[] args) {

    }
}