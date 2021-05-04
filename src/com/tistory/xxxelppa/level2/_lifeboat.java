package com.tistory.xxxelppa.level2;

import java.util.Arrays;

public class _lifeboat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int left = 0;
        int right = people.length - 1;
        
        Arrays.sort(people);
        
        while (left < right) {
            if (people[left] + people[right] <= limit) ++left;
            ++answer;
            --right;
        }
        
        if (left == right) ++answer;
        
        return answer;
    }
}
