package com.nimkoes.programmers.level0;

public class Solution_012 {
    final int LAMB_SKEWERS_PRICE = 12000;
    final int DRINK_PRICE = 2000;
    final int VIP_ORDER_COUNT = 10;

    public int solution(int n, int k) {
        return LAMB_SKEWERS_PRICE * n + DRINK_PRICE * (k - n / VIP_ORDER_COUNT);
    }
}
