package com.nimkoes.programmers.level0;

public class Solution_029 {
    public int solution(int[] sides) {
        int sum = 0, max = -1;
        for (int elem : sides) {
            sum += elem;
            if(max < elem) max = elem;
        }

        return sum - max > max ? 1 : 2;
    }
}
