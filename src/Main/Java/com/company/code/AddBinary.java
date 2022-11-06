package com.company.code;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        //Strings in reverse order
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int sum = carry;
            //converts char to number
            if (i >= 0) sum += a.charAt(i) - '0';
            if (j >= 0) sum += b.charAt(j) - '0';
            //if both chars
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        //moving that append variable (1) to the beginning so we reverse it since append adds it to the end not beginning
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
