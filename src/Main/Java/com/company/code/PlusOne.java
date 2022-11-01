package com.company.code;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // within this for loop the first val is where to start
        // and we will start at the end and work left
        for(int i=n-1; i>=0; i--) {
            // this case is if its not a 9 and the easiest case
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // setting that value to 0 if it is more than 9
            digits[i] = 0;
        }


        // before : [9, 9, 9]
        // after : [1, 0, 0, 0]
        // making a new array off the old one but with 1 extra space for the leading 1
        int[] newNumber = new int [n+1];
        // 0 goes in first place in new int array
        newNumber[0] = 1;
        return newNumber;
    }
}
