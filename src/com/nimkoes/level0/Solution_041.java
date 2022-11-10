package com.nimkoes.level0;

public class Solution_041 {
    final int GENERAL_ANT_POWER = 5;
    final int SOLIDER_ANT_POWER = 3;

    public int solution(int hp) {
        int answer, temp;

        answer = hp / GENERAL_ANT_POWER;
        temp = hp % GENERAL_ANT_POWER;

        answer += temp / SOLIDER_ANT_POWER;
        temp = temp % SOLIDER_ANT_POWER;

        return answer + temp;
    }
}
