package com.nimkoes.level0;

import java.util.ArrayList;
import java.util.List;

public class Solution_056 {
    public int[] solution(int[] numbers, String direction) {
        int size = numbers.length;
        int[] answer = new int[size];

        List<Integer> list = new ArrayList<>();

        if ("right".equals(direction)) {
            list.add(numbers[size - 1]);
            for (int i = 0; i < size - 1; ++i) list.add(numbers[i]);
        } else {
            for (int i = 1; i < size; ++i) list.add(numbers[i]);
            list.add(numbers[0]);
        }

        for (int i = 0; i < size; ++i) answer[i] = list.get(i);
        return answer;
    }
}
