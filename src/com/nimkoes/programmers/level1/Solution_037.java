package com.nimkoes.programmers.level1;

public class Solution_037 {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; ++i) {
            answer += getFactorCount(i) % 2 == 0 ? i : -1 * i;
        }
        return answer;
    }

    private int getFactorCount(int target) {
        int count = 1;
        for (int i = target / 2; i > 0; --i) {
            if (target % i == 0) {
                ++count;
            }
        }
        return count;
    }
}
