package com.nimkoes.level1;

public class _adding_minus_and_plus {
    public int solution(int[] absolutes, boolean[] signs) {
        int size = absolutes.length;
        int answer = 0;
        
        for (int i = 0; i < size; ++i) {
            answer += signs[i] ? absolutes[i] : (-1) * absolutes[i];
        }
        
        return answer;
    }
}
