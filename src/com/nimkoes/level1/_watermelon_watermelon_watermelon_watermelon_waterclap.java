package com.nimkoes.level1;

public class _watermelon_watermelon_watermelon_watermelon_waterclap {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) answer.append("수");
            else answer.append("박");
        }
        return answer.toString();
    }
}
