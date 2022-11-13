package com.nimkoes.level0;

import java.util.Arrays;

public class Solution_063 {
    public int solution(String before, String after) {
        char[] bf = before.toCharArray(), af = after.toCharArray();
        Arrays.sort(bf);
        Arrays.sort(af);
        return String.valueOf(bf).equals(String.valueOf(af)) ? 1 : 0;
    }
}
