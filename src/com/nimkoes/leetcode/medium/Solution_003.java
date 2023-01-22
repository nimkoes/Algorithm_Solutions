package com.nimkoes.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Solution_003 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int size = nums.length;
        int p1 = (int) Math.pow(2, size);
        int p2 = (int) Math.pow(2, size + 1);

        int loopCount = p2 - p1;
        for (int i = 0; i < loopCount; ++i) {
            String mask = Integer.toBinaryString(p1++).substring(1);
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; ++j) if (mask.charAt(j) == '1') list.add(nums[j]);
            result.add(list);
        }

        return result;
    }
}

/* result summary
Runtime: 1 ms, faster than 59.86% of Java online submissions for Subsets.
Memory Usage: 42.6 MB, less than 52.6% of Java online submissions for Subsets.
 */

