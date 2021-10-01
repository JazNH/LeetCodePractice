package com.company.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverseNormalInt() {
        int x = 123;
        int z = 321;
        int y = ReverseInteger.reverse(x);
        assertEquals(z,y);
    }

    @Test
    void reverseNegativeInt() {
        int x = -123;
        int z = -321;
        int y = ReverseInteger.reverse(x);
        assertEquals(z,y);
    }

    @Test
    void reverseEndingZero() {
        int x = 120;
        int z = 21;
        int y = ReverseInteger.reverse(x);
        assertEquals(z,y);
    }
}