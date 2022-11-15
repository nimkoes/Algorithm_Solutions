package com.nimkoes.level0;

public class Solution_084 {
    public int solution(int a, int b) {
        if (a % b == 0) return 1;
        for (int i = 2; i <= a; ++i) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
                i = 2;
            }
        }

        if ((b % 2 == 0 || b % 5 == 0)) {
            for (int i = 3; i < b; ++i) {
                if (i % 2 == 0 || i % 5 == 0) continue;
                if (b % i == 0) return 2;
            }
        } else {
            return 2;
        }

        return 1;
    }
}
