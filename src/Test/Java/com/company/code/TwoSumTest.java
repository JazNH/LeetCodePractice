package com.company.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 5;
        int[] expected = new int[2];
        expected[0] = 0;
        expected[1] = 1;
        int target = 9;

        //call the method
        int[] actual = TwoSum.twoSum(nums,target);
        //checking if arrays are the same
        assertArrayEquals(expected, actual);
    }
}