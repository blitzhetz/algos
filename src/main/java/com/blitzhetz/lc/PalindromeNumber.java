package com.blitzhetz.lc;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // negative numbers
        if (x < 0)
            return false;

        int reversedNum = 0;
        int copy = x;

        while (x > 0) {
            int rem = x % 10;
            reversedNum = reversedNum * 10 + rem;
            x /= 10;
        }
        return reversedNum == copy;
    }

    public static void main(String[] args) {
        PalindromeNumber pNumber = new PalindromeNumber();

        // case 1
        System.out.println(pNumber.isPalindrome(121));
        // case 2
        System.out.println(pNumber.isPalindrome(-121));
        // case 3
        System.out.println(pNumber.isPalindrome(10));
    }
}
