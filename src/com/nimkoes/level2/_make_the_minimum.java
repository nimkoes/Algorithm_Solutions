package com.nimkoes.level2;

import java.util.Arrays;

public class _make_the_minimum {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int size = A.length;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i < size; ++i) answer += A[i] * B[size - i - 1];
        
        return answer;
    }
}
