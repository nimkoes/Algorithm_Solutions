package com.nimkoes.level0;

public class Solution_060 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; ++i) {
            if (check(i)) ++answer;
        }
        return answer;
    }

    private boolean check(int num) {
        int count = 0;
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) ++count;
            if (count >= 3) return true;
        }
        return false;
    }
}
