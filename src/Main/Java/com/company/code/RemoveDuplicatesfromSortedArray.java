package com.company.code;

public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {
        //since we start at pos 1 not 0, cuz 0 is always unique and not compared to anything
        int index = 1;
        //length - 1 so we dont get index out of bounce error
        for(int i=0; i<nums.length-1;i++) {
            //if two numbers next to each other aren't the same
            if(nums[i] != nums[i+1]) {
                //then place current number on the index we're on. Index should hold all unique elements
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}
