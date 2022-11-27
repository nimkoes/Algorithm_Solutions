package com.nimkoes.programmers.level0;

import java.util.ArrayList;
import java.util.List;

public class Solution_045 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int elem : numlist) if (elem % n == 0) list.add(elem);

        int[] answer = new int[list.size()];
        int i = 0;
        for (Integer elem : list) answer[i++] = elem;

        return answer;
    }
}
