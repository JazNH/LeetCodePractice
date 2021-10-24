package com.company.code;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        //create a new int index
        int index = 0;
        //loop through nums thats given
        for(int i:nums) {
            //check if i is val, if not thats good and we continue
            if(i != val) {
                //increments index to return the size
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
