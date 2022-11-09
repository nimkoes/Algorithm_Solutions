package com.tistory.xxxelppa.level0;

public class Solution_023 {
    public int[] solution(String[] strlist) {
        int size = strlist.length;
        int[] answer = new int[size];
        for (int i = 0; i < size; ++i) answer[i] = strlist[i].length();
        return answer;
    }
}
