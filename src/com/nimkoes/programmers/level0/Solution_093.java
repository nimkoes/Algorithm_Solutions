package com.nimkoes.programmers.level0;

public class Solution_093 {
    public int solution(int[] common) {
        int diff = -1;
        int last_index = common.length - 1;
        if ((diff = common[1] - common[0]) == common[2] - common[1]) return common[last_index] + diff;
        return common[last_index] * (common[1] / common[0]);
    }
}
