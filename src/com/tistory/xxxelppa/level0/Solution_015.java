package com.tistory.xxxelppa.level0;

public class Solution_015 {
    final int ODD_INDEX = 0;
    final int EVEN_INDEX = 1;

    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int num : num_list) {
            if(num % 2 == 0) ++answer[ODD_INDEX];
            else ++answer[EVEN_INDEX];
        }
        return answer;
    }
}
