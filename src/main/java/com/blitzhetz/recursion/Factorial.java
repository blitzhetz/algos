package com.blitzhetz.recursion;

public class Factorial {
    static int factorial(int n) {
        // n! = n * (n - 1) * (n - 2) * (n - 3) * ... * 3 * 2 * 1
        // n! = n * (n - 1)!

        // example
        // 5! = 5 * 4! = 5 * 4 * 3 * 2 * 1 = 120

        if (n != 0)
            // recursive function call
            return n * factorial(n - 1);

        return 1;
    }

    public static void main(String[] args) {
        int result = factorial(0);

        System.out.println("Factorial: " + result);
    }
}
