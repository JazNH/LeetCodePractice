package com.company.code;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        // good to use binary search for this
        int left = 0;
        int right = nums.length - 1;
        while(left<=right) {
            //get the mid value
            int mid = (right+left)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) left = mid + 1;
            if(nums[mid] > target) right = mid - 1;
        }
        return left;
    }
}
