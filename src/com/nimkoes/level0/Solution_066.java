package com.nimkoes.level0;

public class Solution_066 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int elem = i; elem <= j; ++elem) {
            String s = String.valueOf(elem);
            answer += getCount(s, k);
        }
        return answer;
    }

    private int getCount(String s, int k) {
        int result = 0;
        for (char c : s.toCharArray()) {
            if (c - 48 == k) ++result;
        }
        return result;
    }
}
