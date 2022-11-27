package com.nimkoes.programmers.level2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class Solution_015 {
    TreeMap<Integer, Integer> tm;
    Queue<Integer> pQueue, iQueue, resultQueue;
    
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        tm = new TreeMap<>(Collections.reverseOrder());
        pQueue = new LinkedList<>();
        iQueue = new LinkedList<>();
        resultQueue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; ++i) {
            pQueue.add(priorities[i]);
            iQueue.add(i);
            tm.put(priorities[i], tm.getOrDefault(priorities[i], 0) + 1);
        }
        
        makeQueue();
        
        for (int q : resultQueue) {
            ++answer;
            if (q == location) break;
        }
        return answer;
    }
    
    public void makeQueue() {
        
        if (tm.size() <= 0) return;
        
        int curPriority = pQueue.poll();
        int curIndex = iQueue.poll();
        
        if (tm.firstKey() == curPriority) {
            tm.put(tm.firstKey(), tm.get(tm.firstKey()) - 1);
            resultQueue.add(curIndex);
        } else {
            pQueue.add(curPriority);
            iQueue.add(curIndex);
        }
        
        if (tm.get(tm.firstKey()) == 0) tm.remove(tm.firstKey());
        
        makeQueue();
    }
}
