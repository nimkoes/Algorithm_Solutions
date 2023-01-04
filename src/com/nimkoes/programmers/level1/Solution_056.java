package com.nimkoes.programmers.level1;

public class Solution_056 {
    public int solution(String t, String p) {
        int answer = 0;
        int tSize = t.length();
        int pSize = p.length();

        for (int i = 0; i < tSize - pSize + 1; ++i) {
            if (Long.parseLong(t.substring(i, i + pSize)) <= Long.parseLong(p)) ++answer;
        }

        return answer;
    }
}
