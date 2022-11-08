package com.tistory.xxxelppa.level0;

public class Solution_019 {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size];

        int index = size - 1;
        for (int elem : num_list) answer[index--] = elem;

        return answer;
    }
}
