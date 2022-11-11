package com.nimkoes.level0;

public class Solution_050 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] my_chars = sort_array(my_string.toLowerCase().toCharArray());
        for (char elem : my_chars) sb.append(elem);
        return sb.toString();
    }

    private char[] sort_array(char[] array) {
        int size = array.length;

        char temp;
        for (int i = 0; i < size; ++i) {
            for (int j = i; j < size; ++j) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
