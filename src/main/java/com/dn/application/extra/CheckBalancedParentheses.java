package com.dn.application.extra;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBalancedParentheses {

    public boolean checkBalancedParentheses(String parentheses){

        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i = 0; i<parentheses.length();i++){
            char expression = parentheses.charAt(i);
            if(expression=='{' || expression=='(' || expression=='['){
                stack.push(expression);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }
            char checking;
            switch (expression){
                case '}':
                    checking = stack.pop();
                    if(checking == '[' || checking=='('){
                        return false;
                    }
                    break;
                case ')':
                    checking = stack.pop();
                    if(checking == '[' || checking=='{'){
                        return false;
                    }
                    break;
                case ']':
                    checking = stack.pop();
                    if(checking == '{' || checking=='('){
                        return false;
                    }
                    break;
            }
        }
    return true;
    }

    public static void main(String[] args) {
        CheckBalancedParentheses checkBalancedParentheses = new CheckBalancedParentheses();
        System.out.println(checkBalancedParentheses.checkBalancedParentheses("[()]{}{[()()()]}"));
    }
}
