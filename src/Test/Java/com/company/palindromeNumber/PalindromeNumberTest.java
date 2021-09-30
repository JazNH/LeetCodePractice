package com.company.palindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    /**
     * Checks for happy path of a palindrome test
     */
    @Test
    void isPalindromeCorrect() {
        boolean correct = PalindromeNumber.isPalindrome(121);
        assertTrue(correct);
    }

    /**
     * Checks for negative value
     */
    @Test
    void isPalindromeNegative() {
        boolean negative = PalindromeNumber.isPalindrome(-121);
        assertFalse(negative);
    }

    /**
     * Checks for incorrect value
     */
    @Test
    void isPalindromeWrong() {
        boolean wrong = PalindromeNumber.isPalindrome(123);
        assertFalse(wrong);
    }

    /**
     * Checks for zero as input
     */
    @Test
    void isPalindromeZero() {
        boolean zero = PalindromeNumber.isPalindrome(0);
        assertFalse(zero);
    }
}