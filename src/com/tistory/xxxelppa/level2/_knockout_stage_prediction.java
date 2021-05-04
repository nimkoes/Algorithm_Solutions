package com.tistory.xxxelppa.level2;

public class _knockout_stage_prediction {
    public int solution(int n, int a, int b) {
        int answer = 1;
        while ((a = getParentIndex(a)) != (b = getParentIndex(b))) ++answer;
        return answer;
    }
    
    private int getParentIndex(int n) {
        if (n % 2 == 0) return n / 2;
        else return (n / 2) + 1;
    }
}
