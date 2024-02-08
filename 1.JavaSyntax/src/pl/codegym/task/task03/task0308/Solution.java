package pl.codegym.task.task03.task0308;

/* 
Iloczyn 10 liczb
*/

public class Solution {
    public static void main(String[] args) {
        int iloczyn10 = 1;
        for (int i=1; i < 11; i++){
            iloczyn10 *= i;
        }
        System.out.println(iloczyn10);
    }
}
