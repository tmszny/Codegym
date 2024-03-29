package pl.codegym.task.task15.task1507;

/* 
OOP: przeciążanie metod
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Wypełnianie obiektami typu String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(Integer m, int n, String value){
        printMatrix((int) m, n, (Object) value);
    }

    public static void printMatrix(float m, int n, String value){
        printMatrix((int) m,n,(Object) value);
    }

    public static void printMatrix(short m, int n, Object value){
        printMatrix((int) m, n,value);
    }

    public static void printMatrix(double m, int n, String value){
        printMatrix((int) m,n,(Object) value);
    }

    public static void printMatrix(float m, double n, String value){
        printMatrix((int) m, (int) n,(Object) value);
    }

    public static void printMatrix(double m, double n, String value){
        printMatrix((int) m, (int) n,(Object) value);
    }

    public static void printMatrix(Integer m, Integer n, Object value){
        printMatrix((int) m, (int) n, value);
    }

    public static void printMatrix(Integer m, Integer n, String value){
        printMatrix((int) m, (int) n,(Object) value);
    }

}
