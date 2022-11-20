package com.nimkoes.level1;

import java.util.stream.IntStream;

public class Solution_023 {
    public double solution(int[] arr) {
        return IntStream.of(arr).average().getAsDouble();
    }
}
