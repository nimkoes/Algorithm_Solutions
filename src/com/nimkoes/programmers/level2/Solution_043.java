package com.nimkoes.programmers.level2;

public class Solution_043 {
    public int solution(int n) {
        int target = getCount(n);
        int answer = ++n;
        while (target != getCount(n++)) answer = n;
        return answer;
    }
    
    public int getCount(int n) {
        int result = 1;
        while (n != 0) {
            if (n % 2 == 1) ++result;
            n /= 2;
        }
        return result;
    }
}
