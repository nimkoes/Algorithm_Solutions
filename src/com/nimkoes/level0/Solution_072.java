package com.nimkoes.level0;

public class Solution_072 {
    public int solution(int[] numbers, int k) {
        return numbers[((k * 2 - 1) % numbers.length) - 1];
    }
}
