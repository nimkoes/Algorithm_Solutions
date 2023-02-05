package com.nimkoes.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution_005 {
    public List<Integer> partitionLabels(String s) {
        int size = s.length();
        if (s == null || size == 0) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        int[] lastIndex = new int[26];

        // 각 알파벳 마지막 등장 위치 저장
        for (int i = 0; i < size; ++i) lastIndex[s.charAt(i) - 'a'] = i;

        int startIndex = 0, endIndex = 0;
        for (int i = 0; i < size; ++i) {

            // i 번째 알파벳의 마지막 위치가 i 번째인 경우 partition
            if ((endIndex = Math.max(endIndex, lastIndex[s.charAt(i) - 'a'])) == i) {
                result.add(endIndex - startIndex + 1);
                startIndex = endIndex + 1;
            }
        }

        return result;
    }
}

/* result summary
Runtime: 2 ms, faster than 98.80% of Java online submissions for Partition Labels.
Memory Usage: 40.06 MB, less than 93.3% of Java online submissions for Partition Labels.
 */

