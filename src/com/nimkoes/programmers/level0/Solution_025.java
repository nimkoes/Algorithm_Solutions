package com.nimkoes.programmers.level0;

public class Solution_025 {
    public int solution(int[] numbers) {
        int size = numbers.length;
        if (size == 2) return numbers[0] * numbers[1];

        int first, second;
        if (numbers[0] > numbers[1]) {
            first = numbers[0];
            second = numbers[1];
        } else {
            first = numbers[1];
            second = numbers[0];
        }

        int current;
        for (int i = 2; i < size; ++i) {
            current = numbers[i];
            if(current > first) {
                second = first;
                first = current;
            } else if (current > second) {
                second = current;
            }
        }

        return first * second;
    }
}
