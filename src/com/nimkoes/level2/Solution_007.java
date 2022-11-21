package com.nimkoes.level2;

public class Solution_007 {
    public String solution(int n) {
        String answer = "";
        String[] canUse = new String[]{"4", "1", "2"};
        int m = 0;
        
        while (n != 0) {
            m = n % 3;
            n /= 3;
            if (m == 0) --n;
            answer = canUse[m] + answer;
        }
        
        return answer;
    }
}
