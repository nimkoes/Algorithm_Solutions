package com.nimkoes.level1;

import java.util.HashSet;
import java.util.Set;

public class Solution_041 {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            // 가져갈 수 있는 최대 값에 도달하면 멈춘다
            if (set.size() == max) break;
            
            // 종류의 수를 구해야 하기 때문에 없는 종류를 선택 했을 때만 set에 담는다.
            if (!set.contains(num)) set.add(num);
        }
        return set.size();
    }
}
