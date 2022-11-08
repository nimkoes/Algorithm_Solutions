package com.tistory.xxxelppa.level0;

public class Solution_018 {
    final int PIECE_PER_PIZZA = 7;

    public int solution(int n) {
        int answer = n / PIECE_PER_PIZZA;
        return n % PIECE_PER_PIZZA != 0 ? ++answer : answer;
    }
}
