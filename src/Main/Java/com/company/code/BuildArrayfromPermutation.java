package com.company.code;

public class BuildArrayfromPermutation {
    public int[] buildArray(int[] nums) {
        //creating new array of nums with same length
        int[] ans = new int[nums.length];
        //loops thru elements in array
        for(int i : nums) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
