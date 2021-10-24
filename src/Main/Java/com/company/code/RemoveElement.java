package com.company.code;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        //create a new int index
        int index = 0;
        //loop through nums thats given
        for(int i:nums) {
            //check if i is val, if not thats good and we continue
            if(i != val) {
                //you need index++ so it moves onto the next val in array
                nums[index++] = i;
            }
        }
        return index;
    }
}
