package pl.codegym.task.task03.task0307;

/* 
Witaj, StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
    Zerg Janusz = new Zerg();
    Janusz.imie = "Janusz";
    Zerg Marek = new Zerg();
    Marek.imie = "Marek";
    Zerg Wacek = new Zerg();
    Wacek.imie = "Wacek";
    Zerg Roman = new Zerg();
    Roman.imie = "Roman";
    Zerg Eryk = new Zerg();
    Eryk.imie = "Eryk";

    Protoss Janus = new Protoss();
    Janus.imie = "Janus";
    Protoss Kamil = new Protoss();
    Kamil.imie = "Kamil";
    Protoss Michal = new Protoss();
    Michal.imie = "Micha";

    Terranin jozek = new Terranin();
    jozek.imie = "jozek";
    Terranin leszek = new Terranin();
    leszek.imie = "leszek";
    Terranin pawel = new Terranin();
    pawel.imie = "pawel";
    Terranin lucek = new Terranin();
    lucek.imie = "lucek";
    }

    public static class Zerg {
        public String imie;
    }

    public static class Protoss {
        public String imie;
    }

    public static class Terranin {
        public String imie;
    }
}
