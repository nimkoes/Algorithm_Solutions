package com.nimkoes.level2;

public class Solution_026 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int totalBlock = brown + yellow;
        
        for (int i = totalBlock / 2; i > 2; --i) {
            if (totalBlock % i == 0) {
                if (((i - 2) * ((totalBlock / i) - 2)) == yellow) {
                    answer[0] = i;
                    answer[1] = totalBlock / i;
                    break;
                }
            }
        }
        return answer;
    }
}
