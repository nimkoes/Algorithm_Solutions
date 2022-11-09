package com.nimkoes.level1;

public class _basics_of_handling_strings {
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
