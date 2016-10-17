package oa;

import java.util.Stack;

public class ValidBraces {
    public static boolean isValid(String s) {
        if(s == null || s.length() == 0)
            return true;
        if(s.length() % 2 == 1)
            return false;
        Stack<Character> stk = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(stk.isEmpty())
                stk.push(s.charAt(i));
            else if(s.charAt(i) - stk.peek() == 1 || s.charAt(i) - stk.peek() == 2)
                stk.pop();
            else
                stk.push(s.charAt(i));
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(isValid("[][][]()[]"));
    }

}
