package com.nimkoes.programmers.level1;

public class Solution_008 {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
