package com.nimkoes.leetcode.medium;

public class Solution_006 {
    public boolean canJump(int[] nums) {
        int temp = 0, size = nums.length;
        for (int i = 0; i <= temp; ++i) {
            // i 번째 위치 에서 갈 수 있는 최대 거리
            if ((temp = Math.max(temp, i + nums[i])) >= size - 1) return true;
        }
        return false;
    }
}

/* result summary
Runtime: 2 ms, faster than 78.89% of Java online submissions for Jump Game.
Memory Usage: 42.6 MB, less than 83% of Java online submissions for Jump Game.
 */

