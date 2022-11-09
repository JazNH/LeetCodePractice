package com.company.code;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int richest = Integer.MIN_VALUE;;
        for(int i=0; i<accounts.length;i++) {
            int temp=0;
            for(int j=0; j<accounts[i].length;j++) {
                richest = richest + accounts[i][j];
            }
            if(temp>richest)
            {
                richest=temp;
            }
        }
        return richest;
    }
}
