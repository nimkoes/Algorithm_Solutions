package com.nimkoes.algo.level_2;

import java.util.Arrays;

public class _001_stock_price {
    public static void main(String[] ar) {
        _001_stock_price simulate = new _001_stock_price();
        int[] result = simulate.solution(simulate.getPrices());
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; ++i) {
            for(int j = i + 1; j < prices.length; ++j) {
                if(prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
                if(j == prices.length-1) answer[i] = j-i;
            }
        }

        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int[] prices;

    public _001_stock_price() {
        prices = new int[] {1, 2, 3, 2, 3};
    }

    public int[] getPrices() {
        return prices;
    }
}
