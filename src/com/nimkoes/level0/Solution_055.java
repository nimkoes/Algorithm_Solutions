package com.nimkoes.level0;

public class Solution_055 {
    public String solution(String my_string, int num1, int num2) {
        char[] my_chars = my_string.toCharArray();
        my_chars[num1] = my_string.charAt(num2);
        my_chars[num2] = my_string.charAt(num1);
        return String.valueOf(my_chars);
    }
}
