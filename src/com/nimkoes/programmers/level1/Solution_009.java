package com.nimkoes.programmers.level1;

import java.util.Arrays;

public class Solution_009 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for (int elem : d) {
            budget -= elem;
            if (budget < 0) break;
            ++answer;
        }
        
        return answer;
    }
}
