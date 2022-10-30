package com.company.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    LengthOfLastWord l = new LengthOfLastWord();

    @Test
    void lengthOfLastWord_normal() {
        String val = "Hello World";
        int actual = l.lengthOfLastWord(val);
        assertEquals(5, actual);
    }

    @Test
    void lengthOfLastWord_moon_normal() {
        String val = "   fly me   to   the moon  ";
        int actual = l.lengthOfLastWord(val);
        assertEquals(4, actual);
    }

    @Test
    void lengthOfLastWord_with_spaces() {
        String val = " Hello World ";
        int actual = l.lengthOfLastWord(val);
        assertEquals(5, actual);
    }

    @Test
    void lengthOfLastWord_with_spaces_negative() {
        String val = " Hello World ";
        int actual = l.lengthOfLastWord(val);
        assertNotEquals(4, actual);
    }
}