package com.nimkoes.level2;

public class _jump_and_teleport {
    public int solution(int n) {
        int ans = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                n -= 1;
                ++ans;
            }
            n /= 2;
        }
        return ans;
    }
}
