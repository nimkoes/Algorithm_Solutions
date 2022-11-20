package com.nimkoes.level1;

import java.util.TreeSet;

public class Solution_039 {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        /*
         * 중복을 허용하지 않는 Set 계열의 Collection 사용
         * 항상 정렬된 상태를 유지하는 TreeSet 클래스 사용
         */
        TreeSet<Integer> tm = new TreeSet<>();
        
        // 모든 경우의 수를 계산하여 TreeSet에 add
        int temp = -1;
        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                temp = numbers[i] + numbers[j];
                tm.add(temp);
            }
        }
        
        // 항상 정렬된 상태를 유지하는 특징을 활용하여 결과 생성
        answer = new int[tm.size()];
        int k = 0;
        for (int t : tm) answer[k++] = t;
        
        return answer;
    }
}
