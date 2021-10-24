package com.company.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElementReturn2() {
        int[] nums = new int[] {3,2,2,3};
        int val = 3;
        int actual = RemoveElement.removeElement(nums, val);
        assertEquals(2, actual);
    }

    @Test
    void removeElementReturn5() {
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;
        int actual = RemoveElement.removeElement(nums, val);
        assertEquals(5, actual);
    }
}