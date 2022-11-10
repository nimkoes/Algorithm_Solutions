package com.nimkoes.level0;

public class Solution_042 {
    public int[] solution(String my_string) {
        String myNumberString = my_string.replaceAll("[a-z]", "");
        return sort_my_chars(myNumberString.toCharArray());
    }

    private int[] sort_my_chars(char[] my_chars) {
        int size = my_chars.length;

        char temp;
        for (int i = 0; i < size; ++i) {
            for (int j = i; j < size; ++j) {
                if (my_chars[i] > my_chars[j]) {
                    temp = my_chars[i];
                    my_chars[i] = my_chars[j];
                    my_chars[j] = temp;
                }
            }
        }

        int[] result = new int[size];
        for (int i = 0; i < size; ++i) {
            result[i] = my_chars[i] - 48;
        }

        return result;
    }
}
