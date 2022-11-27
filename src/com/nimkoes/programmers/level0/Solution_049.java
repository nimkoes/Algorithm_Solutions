package com.nimkoes.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class Solution_049 {
    public int[] solution(int n) {
        if (n == 1) return new int[]{1};

        int mid = n / 2;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= mid; ++i) if (n % i == 0) list.add(i);
        list.add(n);

        int size = list.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; ++i) answer[i] = list.get(i);

        return answer;
    }
}
