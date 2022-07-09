package com.company.code;

public class ConcatenationOfArray {

    // Given an integer array nums of length n, you want to create an array ans of length 2n where
    // ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
    //
    // Specifically, ans is the concatenation of two nums arrays.
    //
    // Return the array ans.
    public int[] getConcatenation(int[] nums) {
        // getting size of nums
        int n = nums.length;
        // here we double that size we want our new ans int array to be
        int[] ans = new int[2*n];
        //loop through every number in nums
        for(int i=0;i<n;i++) {
            // for each number in nums add it to ans
            ans[i] = nums[i];
            // adds it once again to basically double the array
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
