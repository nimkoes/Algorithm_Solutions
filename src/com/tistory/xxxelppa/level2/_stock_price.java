package com.tistory.xxxelppa.level2;

public class _stock_price {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; ++i) {
            for (int j = i + 1; j < prices.length; ++j) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
                if (j == prices.length - 1) answer[i] = j - i;
            }
        }
        
        return answer;
    }
}