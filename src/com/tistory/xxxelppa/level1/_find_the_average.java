package com.tistory.xxxelppa.level1;

import java.util.stream.IntStream;

public class _find_the_average {
    public double solution(int[] arr) {
        return IntStream.of(arr).average().getAsDouble();
    }
}
