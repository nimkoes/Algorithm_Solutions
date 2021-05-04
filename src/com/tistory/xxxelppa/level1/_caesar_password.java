package com.tistory.xxxelppa.level1;

public class _caesar_password {
    public String solution(String s, int n) {
        return s.chars().map(c -> {
            int k = n % 26;
            
            if (c >= 'a' && c <= 'z') return 'a' + (c - 'a' + k) % 26;
            else if (c >= 'A' && c <= 'Z') return 'A' + (c - 'A' + k) % 26;
            else return c;
        }).mapToObj(c -> String.valueOf((char) c))
                .reduce((a, b) -> a + b).orElse("");
    }
}
