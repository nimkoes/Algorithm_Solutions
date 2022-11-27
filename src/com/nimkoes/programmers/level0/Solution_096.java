package com.nimkoes.programmers.level0;

public class Solution_096 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = (denum1 * num2) + (denum2 * num1);
        int num = num1 * num2;

        for (int i = Math.min(denum, num); i > 1; ) {
            if (denum % i == 0 && num % i == 0) {
                denum /= i;
                num /= i;
                continue;
            }
            --i;
        }

        return new int[]{denum, num};
    }
}
