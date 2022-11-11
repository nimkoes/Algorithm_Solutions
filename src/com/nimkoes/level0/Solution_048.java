package com.nimkoes.level0;

public class Solution_048 {
    private final int ASCII_DIFF = 'a' - 'A';
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (char elem : my_string.toCharArray()) sb.append((getMyCharacter(elem)));
        return sb.toString();
    }

    private char getMyCharacter(char elem) {
        if (elem < 'a') return (char) (elem + ASCII_DIFF);
        else return (char) (elem - ASCII_DIFF);
    }
}
