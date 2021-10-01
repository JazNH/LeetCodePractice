package com.company.code;

public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        int pop = 0;
        System.out.println("x: " + x);

        while (x != 0){
            //taking last digit and putting it into pop
            pop = x % 10;
            //removing the last digit from x and setting x as a new thing for the while loop
            x /= 10;

            //checks for reversed and pop value being too high
            if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop > 7) return 0;
            //checks for reversed and pop value being too low
            if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop < -8) return 0;

            //multiple reversed by 10 and add the last value to basically flip them and thats it
            System.out.println("reversed: " + reversed);
            reversed = (reversed * 10) + pop;
        }

        System.out.println("pop: " + pop);
        return reversed;
    }
}
