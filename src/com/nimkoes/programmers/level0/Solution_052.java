package com.nimkoes.programmers.level0;

public class Solution_052 {
    private final int PIECE_PER_PIZZA = 6;

    public int solution(int n) {
        return lcm(PIECE_PER_PIZZA, n) / PIECE_PER_PIZZA;
    }

    private int lcm(int n1, int n2) { //최소 공배수
        return n1 * n2 / gdc(n1, n2);
    }

    private int gdc(int n1, int n2) { //최대 공약수
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        while (n2 != 0) {
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        return n1;
    }
}
