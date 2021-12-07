package com.lerisoft.java.exercise;

import java.util.HashSet;
import java.util.Set;

public class PalindromStringCheck {

    private static final int MIN_STRING_CHAR = 3;

    public static void main(String[] args) {

        StringBuilder sampleString = new StringBuilder("abadefghhgfijklm");
        int size = 3;
        String finalString = "";

        System.out.println("**** Long consecutive palindrome  ****");
        System.out.println("Given String  => "+sampleString);

        Set<String> setPal = new PalindromStringCheck().findAllPalindromesString("abadefghhgfijklm");

        for (String str:setPal) {
            if(str.length() > size){
                size = str.length();
                finalString=str;
            }
        }
        //System.out.println(new com.lerisoft.java.exercise.PalindromStringCheck().findAllPalindromesUsingBruteForceApproach("abadefghhgfijklm"));
        System.out.println("Total palindrome string found (greater than 2 char) :"+setPal);
        System.out.println("Longest string :"+finalString);
    }

    /* Find all palindrome string for given input */
    public Set<String> findAllPalindromesString(String input) {
        Set<String> palindromes = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if ((input.substring(i, j).length() >=MIN_STRING_CHAR) && isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        return palindromes;
    }

    /* Check given string is Palindrome string or not*/
    private boolean isPalindrome(String input) {
        StringBuilder plainStr = new StringBuilder(input);
        StringBuilder reverseStr = plainStr.reverse();
        return (reverseStr.toString()).equals(input);
    }
}
