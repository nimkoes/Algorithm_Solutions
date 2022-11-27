package com.nimkoes.programmers.level0;

import java.util.HashSet;

public class Solution_062 {
    public String solution(String my_string) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (Character elem : my_string.toCharArray()) {
            if (!set.contains(elem)) {
                set.add(elem);
                sb.append(elem);
            }
        }
        return sb.toString();
    }
}
