package com.nimkoes.leetcode.medium;

public class Solution_002 {
    public int numberOfBeams(String[] bank) {
        int answer = 0, temp = 0;
        for (String elem : bank) {
            int count = 0;
            for (char c : elem.toCharArray()) if(c == '1') ++count;
            if (count == 0) continue;

            answer += temp * count;
            temp = count;
        }
        return answer;
    }
}

/* result summary
Runtime: 15 ms, faster than 96.17% of Java online submissions for Number of Laser Beams in a Bank.
Memory Usage: 43.5 MB, less than 82.27% of Java online submissions for Number of Laser Beams in a Bank.
 */

