package com.nimkoes.programmers.level0;

public class Solution_016 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int elem : array) {
            if (elem == n) ++answer;
        }
        return answer;
    }
}
