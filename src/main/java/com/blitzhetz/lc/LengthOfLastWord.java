package com.blitzhetz.lc;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {

        s = s.trim();
        int count = 0;

        // why should I use this???
        if (s.length() == 0)
            return 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "";

        String case1 = "Hello World";
        String case2 = "   fly me   to   the moon  ";
        String case3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(case1));
        System.out.println(lengthOfLastWord(case2));
        System.out.println(lengthOfLastWord(case3));
    }
}
