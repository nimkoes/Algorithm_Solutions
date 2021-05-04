package com.tistory.xxxelppa.level1;

import java.util.Set;
import java.util.TreeSet;

public class _an_array_of_dividing_numbers {
    public int[] solution(int[] arr, int divisor) {
        Set<Integer> set = new TreeSet<>();
        
        for (int elem : arr) if (elem % divisor == 0) set.add(elem);
        
        int[] answer = new int[set.size()];
        
        int i = 0;
        for (Integer elem : set) answer[i++] = elem;
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
