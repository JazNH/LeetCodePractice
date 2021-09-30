package com.company.code;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //loop through int[]
        for(int i=0;i<nums.length;i++){
            //take the target and subtract from a postion in the array
            int p = target - nums[i];
            //if that map contains that subtracted number rerturn it
            if(map.containsKey(p)){
                return new int[] {map.get(p),i};
            }
            //if not add it to the map
            map.put(nums[i], i);
            //once all the numbers are added it should go back around and pick up the correct one
        }
        //throw this exception when no target is found (shouldn't happen)
        throw new IllegalArgumentException("no match found");
    }
}
