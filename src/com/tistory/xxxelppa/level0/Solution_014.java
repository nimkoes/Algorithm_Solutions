package com.tistory.xxxelppa.level0;

public class Solution_014 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int elem : array) {
            if(elem > height) ++answer;
        }
        return answer;
    }
}
