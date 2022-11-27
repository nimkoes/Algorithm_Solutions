package com.nimkoes.programmers.level0;

public class Solution_099 {
    public int solution(int[][] lines) {
        int answer = 0;
        int min = Math.min(Math.min(lines[0][0], lines[1][0]), lines[2][0]);
        int max = Math.max(Math.max(lines[0][1], lines[1][1]), lines[2][1]);

        for (int i = min; i <= max; ++i) {
            int count = 0;
            if (i >= lines[0][0] && i < lines[0][1]) ++count;
            if (i >= lines[1][0] && i < lines[1][1]) ++count;
            if (i >= lines[2][0] && i < lines[2][1]) ++count;
            if (count >= 2) ++answer;
        }

        return answer;
    }
}
