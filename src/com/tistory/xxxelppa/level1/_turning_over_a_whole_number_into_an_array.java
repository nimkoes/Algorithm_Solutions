package com.tistory.xxxelppa.level1;

public class _turning_over_a_whole_number_into_an_array {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        
        for (int i = s.length() - 1, j = 0; i >= 0; --i) answer[j++] = s.charAt(i) - 48;
        
        return answer;
    }
}
