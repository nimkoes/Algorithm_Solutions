package com.nimkoes.programmers.level1;

public class Solution_049 {
    boolean solution(String s) {
        int size = s.length();
        int sum = 0;
        
        for (int i = 0; i < size; ++i) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P') ++sum;
            else if (c == 'y' || c == 'Y') --sum;
        }
        
        return sum == 0 ? true : false;
    }
}
