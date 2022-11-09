package com.tistory.xxxelppa.level0;

public class Solution_026 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int size = num2 - num1 + 1;
        int[] answer = new int[size];
        for(int i = 0, j = num1; i < size; ++i, ++j) answer[i] = numbers[j];
        return answer;
    }
}
