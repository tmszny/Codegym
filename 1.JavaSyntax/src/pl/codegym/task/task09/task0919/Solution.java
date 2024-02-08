package pl.codegym.task.task09.task0919;

/* 
Dzielenie przez zero
*/

public class Solution {

    public static void main(String[] args) {

        try {

            dzielimyPrzezZero();

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void dzielimyPrzezZero(){
        int a = 5;
        a = a/0;
        System.out.println(a);
    }
}
