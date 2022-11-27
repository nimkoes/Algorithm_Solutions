package com.nimkoes.programmers.weekly_challenge;

public class Week_005 {
    
    public int solution(String word) {
        int answer = 0, len = word.length();
        final int SIZE = 5;

        char[] ch = {'A', 'E', 'I', 'O', 'U'};
        int[] diff = {781, 156, 31, 6, 1};

        for (int i = 0; i < len; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                if (ch[j] == word.charAt(i)) {
                    answer += 1 + j * diff[i];
                }
            }
        }
        return answer;
    }
}
