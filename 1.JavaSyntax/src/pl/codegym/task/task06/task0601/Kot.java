package pl.codegym.task.task06.task0601;

/* 
Metoda finalize (obiektu) Kot
*/

public class Kot {
    String name;
    int wiek;

    public Kot(String name, int wiek){
        this.name = name;
        this.wiek = wiek;
    }

    protected void finalize() throws Throwable{
        System.out.println("co do ch...");
    }
    public static void main(String[] args) {

    }
}
