package com.tistory.xxxelppa.weekly_challenge;

public class Week_001 {
    public long solution(int price, int money, int count) {
        long p = price, m = money, c = count;
        return Math.max(((p + (p * c)) * c / 2) - m, 0);
    }
}
