package com.nimkoes.level0;

public class Solution_058 {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for (int i = code - 1; i < cipher.length(); i += code) sb.append(cipher.charAt(i));
        return sb.toString();
    }
}
