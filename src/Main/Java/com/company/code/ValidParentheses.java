package com.company.code;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        // This uses stacks. Like a pancake its will look at the top value and for whatever it is it will add the next
        // matching set to it. Then finally check if its empty
        if (s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if(c=='(') {
                stack.push(')');
            } else if (c=='{') {
                stack.push('}');
            } else if (c=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
