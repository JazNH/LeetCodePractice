package com.company.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void test1() {
        ValidParentheses v = new ValidParentheses();
        boolean val = v.isValid("()");
        assertEquals(true, val);
    }

    @Test
    void test2() {
        ValidParentheses v = new ValidParentheses();
        boolean val = v.isValid("()[]{}");
        assertEquals(true, val);
    }

    @Test
    void test3() {
        ValidParentheses v = new ValidParentheses();
        boolean val = v.isValid("(]");
        assertEquals(false, val);
    }
}