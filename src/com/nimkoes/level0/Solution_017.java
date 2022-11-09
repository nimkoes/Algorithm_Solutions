package com.nimkoes.level0;

public class Solution_017 {
    final int PRICE = 5500;

    public int[] solution(int money) {
        return new int[]{money / PRICE, money % PRICE};
    }
}
