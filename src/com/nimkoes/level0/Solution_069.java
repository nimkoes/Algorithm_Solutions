package com.nimkoes.level0;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Solution_069 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (Character c : chars) lhm.put(c, lhm.getOrDefault(c, 0) + 1);
        lhm.forEach((k, v) -> {
            if(v == 1) sb.append(k);
        });
        return sb.toString();
    }
}
