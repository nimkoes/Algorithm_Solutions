package com.nimkoes.level2;

import java.util.Arrays;
import java.util.Collections;

public class _h_index {
    public int solution(int[] citations) {
        int answer = 0;
        
        Integer[] orderedArr = Arrays.stream(citations)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);
        
        if (orderedArr[0] == 0) return 0;
        
        for (int i = 1; i <= orderedArr.length; ++i) {
            if (orderedArr[i - 1] < i) {
                answer = i - 1;
                break;
            }
        }
        
        return answer == 0 ? orderedArr.length : answer;
    }
}
