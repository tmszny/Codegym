package pl.codegym.task.task09.task0918;

/* 
Wszyscy są naszymi kumplami, nawet wyjątki
*/

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends RuntimeException {
    }

    static class MyException2 extends  MyException{
    }

    static class MyException3 extends Exception {
    }

    static class MyException4 extends  MyException3{
    }
}

