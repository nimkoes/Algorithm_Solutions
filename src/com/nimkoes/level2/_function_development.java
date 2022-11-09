package com.nimkoes.level2;

import java.util.ArrayList;
import java.util.List;

public class _function_development {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        int deployIndex = 0;
        int size = progresses.length;
        List<Integer> list = new ArrayList<>();
        
        while (deployIndex < size) {
            for (int i = deployIndex; i < size; ++i) {
                if (progresses[i] < 100) progresses[i] += speeds[i];
            }
            
            int deployCount = 0;
            for (int i = deployIndex; i < size; ++i) {
                if (progresses[i] < 100) break;
                ++deployCount;
                ++deployIndex;
            }
            
            if (deployCount > 0) {
                list.add(deployCount);
            }
        }
        
        answer = new int[list.size()];
        int index = 0;
        for (Integer elem : list) {
            answer[index++] = elem;
        }
        
        return answer;
    }
}
