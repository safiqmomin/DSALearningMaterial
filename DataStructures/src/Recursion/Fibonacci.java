package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciNumber(10);

    }

    static int fibonacciNumber(int i) {
        if (i < 0){
             return 1;
        }
        System.out.println(i);
        return (i + fibonacciNumber(i-1));
    }
}
