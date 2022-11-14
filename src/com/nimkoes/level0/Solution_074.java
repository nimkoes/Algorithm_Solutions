package com.nimkoes.level0;

import java.util.TreeSet;

public class Solution_074 {
    public int[] solution(int n) {
        int temp = 1, m = n;
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 2; i <= n && temp != n; ) {
            if (m % i == 0) {
                temp *= i;
                m /= i;
                ts.add(i);
                continue;
            }
            ++i;
        }

        if (ts.size() == 0) return new int[]{n};

        int index = 0;
        int[] answer = new int[ts.size()];
        while (ts.size() > 0) answer[index++] = ts.pollFirst();

        return answer;
    }
}
