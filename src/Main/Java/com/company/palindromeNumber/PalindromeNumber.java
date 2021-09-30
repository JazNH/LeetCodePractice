package com.company.palindromeNumber;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x > 0){
            int isPalindrome = 0;
            for (int i = x; i !=0; i /= 10) {
                isPalindrome = isPalindrome * 10 + i % 10;
            }
            if(isPalindrome==x){
                return true;
            }
        }
        return false;
    }
}
