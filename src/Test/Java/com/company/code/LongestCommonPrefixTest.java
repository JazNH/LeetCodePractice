package com.company.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix_fl() {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        String val = l.longestCommonPrefix(strs);
        assertEquals("fl", val);
    }

    @Test
    void longestCommonPrefix_negative() {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] strs = {"dog","racecar","car"};
        String val = l.longestCommonPrefix(strs);
        assertEquals("", val);
    }
}