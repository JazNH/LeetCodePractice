package com.company.code;

public class FinalValueofVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for(int i=0; i<operations.length;i++)  {
            //if the char at position 1 (not 0) has a + then subtract by 1
            if(operations[i].charAt(1) == '-') {
                X--;
            } else {
                X++;
            }
        }
        return X;
    }
}
