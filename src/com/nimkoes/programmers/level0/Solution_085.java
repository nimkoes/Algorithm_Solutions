package com.nimkoes.programmers.level0;

import java.util.Stack;

public class Solution_085 {
    public int solution(String s) {
        String[] input = s.split(" ");
        Stack<Integer> st = new Stack<>();

        for (String elem : input) {
            if ("Z".equals(elem)) st.pop();
            else st.push(Integer.parseInt(elem));
        }

        return st.stream().reduce((a, b) -> a + b).orElse(0).intValue();
    }
}
