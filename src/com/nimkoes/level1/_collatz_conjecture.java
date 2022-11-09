package com.nimkoes.level1;

public class _collatz_conjecture {
    public int solution(int n) {
        int answer = 0;
        long num = (long) n;
        while (num != 1 && answer <= 500) {
            ++answer;
            if (num % 2 == 0) num = num / 2;
            else num = num * 3 + 1;
        }
        return num == 1 ? answer : -1;
    }
}
