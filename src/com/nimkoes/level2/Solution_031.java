package com.nimkoes.level2;

import java.util.HashSet;
import java.util.Set;

public class Solution_031 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0, 0};
        
        char beforeTail, afterHead;
        Set<String> set = new HashSet<>();
        
        set.add(words[0]);
        beforeTail = words[0].charAt(words[0].length() - 1);
        
        for (int i = 1; i < words.length; ++i) {
            afterHead = words[i].charAt(0);
            if (beforeTail != afterHead || set.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            set.add(words[i]);
            beforeTail = words[i].charAt(words[i].length() - 1);
        }
        
        return answer;
    }
}
