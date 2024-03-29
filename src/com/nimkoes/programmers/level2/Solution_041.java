package com.nimkoes.programmers.level2;

public class Solution_041 {
    boolean solution(String s) {
        int temp = 0;
        int size = s.length();
        
        for (int i = 0; i < size; ++i) {
            if (temp == 0 && s.charAt(i) == ')') return false;
            
            if (s.charAt(i) == '(') ++temp;
            else --temp;
        }
        
        return (temp == 0);
    }
}
