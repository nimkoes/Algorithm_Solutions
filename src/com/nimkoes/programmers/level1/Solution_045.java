package com.nimkoes.programmers.level1;

public class Solution_045 {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        if (arr.length == 1) return answer;
        
        int pos = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                pos = i;
                min = arr[i];
            }
        }
        
        answer = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; ++i) {
            if (i == pos) continue;
            answer[j++] = arr[i];
        }
        
        return answer;
    }
}
