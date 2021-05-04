package com.tistory.xxxelppa.level2;

import java.util.LinkedList;
import java.util.Queue;

public class _cache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if (cacheSize == 0) return 5 * cities.length;
        
        Queue<String> queue = new LinkedList<>();
    
        String current;
        for (String city : cities) {
            current = city.toLowerCase();
            if (queue.remove(current)) {
                ++answer;
            } else {
                answer += 5;
                if (queue.size() >= cacheSize) queue.poll();
            }
            queue.add(current);
        }
        return answer;
    }
}
