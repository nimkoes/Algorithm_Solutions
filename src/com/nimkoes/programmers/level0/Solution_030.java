package com.nimkoes.programmers.level0;

public class Solution_030 {
    final int _5_PERCENT = 100000;
    final int _10_PERCENT = 300000;
    final int _20_PERCENT = 500000;

    public int solution(int price) {
        if (price >= _20_PERCENT) return (int) (price * 0.8);
        else if (price >= _10_PERCENT) return (int) (price * 0.9);
        else if (price >= _5_PERCENT) return (int) (price * 0.95);
        return price;
    }
}
