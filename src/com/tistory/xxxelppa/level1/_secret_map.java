package com.tistory.xxxelppa.level1;

public class _secret_map {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; ++i) {
            String temp = lpad(n, Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = temp.replace("1", "#").replace("0", " ");
        }
        
        return answer;
    }
    
    public String lpad(int len, String str) {
        return " ".repeat(Math.max(0, len - str.length())) + str;
    }
}
