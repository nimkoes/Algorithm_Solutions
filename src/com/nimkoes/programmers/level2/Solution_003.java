package com.nimkoes.programmers.level2;

import java.util.Stack;

public class Solution_003 {
    public int solution(String s) {
        if (s.length() % 2 != 0) return 0;
        
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (st.empty() || st.peek() != c) st.push(c);
            else st.pop();
        }
        return st.empty() ? 1 : 0;
    }
}
