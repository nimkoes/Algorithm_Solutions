package com.nimkoes.level0;

public class Solution_067 {
    public int solution(int[] array) {
        int answer = 0;
        for (int elem : array) {
            answer += getCount(String.valueOf(elem).toCharArray());
        }
        return answer;
    }

    private int getCount(char[] s) {
        int result = 0;
        for (char elem : s) if(elem == '7') ++result;
        return result;
    }
}
