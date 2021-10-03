package com.company.code;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        //Creating a hash map for all the comparison values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //This result variable will the last char of the string
        int result = map.get(s.charAt(s.length()-1));

        //Look over string, starting with 2nd to last char
        for(int i = s.length()-2; i>=0; i--) {
            //Compare values from i and i + 1
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                //If its lower first then subtract it
                result -= map.get(s.charAt(i));
            } else {
                //If its lower first then add it
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
