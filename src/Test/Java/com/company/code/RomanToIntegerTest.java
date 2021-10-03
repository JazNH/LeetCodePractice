package com.company.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToIntNormal_3() {
        String x = "III";
        int actual = RomanToInteger.romanToInt(x);
        assertEquals(3, actual);
    }

    @Test
    void romanToIntSubtractFor_4() {
        String x = "IV";
        int actual = RomanToInteger.romanToInt(x);
        assertEquals(4, actual);
    }

    @Test
    void romanToIntSubtractFor_9() {
        String x = "IX";
        int actual = RomanToInteger.romanToInt(x);
        assertEquals(9, actual);
    }
}