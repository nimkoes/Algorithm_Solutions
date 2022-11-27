package com.nimkoes.programmers.level1;

public class Solution_014 {
    public String solution(String s) {
        char[] c = s.toCharArray();
        
        int pos = 0;
        
        for (int i = 0; i < c.length; ++i) {
            if (c[i] == ' ') {
                pos = 0;
                continue;
            }
            
            if (pos % 2 == 0 && (c[i] >= 'a' && c[i] <= 'z')) c[i] -= 32;
            if (pos % 2 == 1 && (c[i] >= 'A' && c[i] <= 'Z')) c[i] += 32;
            
            ++pos;
        }
        
        return String.valueOf(c);
    }
}
