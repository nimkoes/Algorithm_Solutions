package com.nimkoes.programmers.level1;

public class Solution_057 {
    public int solution(int a, int b, int n) {
        int answer = 0, temp;
        while (true) {
            if (n < a) break;
            answer += (temp = (n / a) * b);
            n = temp + (n % a);
        }
        return answer;  // (n - b) / (a - b) * b;
    }
}
