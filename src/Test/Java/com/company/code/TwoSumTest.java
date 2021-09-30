package com.company.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        //need to create a int array. This isnt correct
        int[] nums = new int[]{2,7,11,15};
        int[] expected = new int[]{0,1};
        int target = 9;
        //call the method
        int[] actual = TwoSum.twoSum(nums,target);
        assertEquals(expected, actual);
    }
}