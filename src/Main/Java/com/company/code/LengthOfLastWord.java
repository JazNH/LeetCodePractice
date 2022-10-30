package com.company.code;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        // We trim first to remove the trailing spaces
        s = s.trim();
        // Will look for a ' '
        int lastIndex = s.lastIndexOf(' ') + 1;
        // The last index is the start of the first ' ' counting to the end of the s String.
        // So start from the first occurrence of the ' ' when counting manually
        return s.length() - lastIndex;

        /*
        Example of using lastIndexOf:

        String s = "Hello World";
        String returnIndex = s.lastIndexOf('o');
        Output: 7
         */
    }
}
