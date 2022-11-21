package com.nimkoes.level2;

import java.util.Arrays;

public class Solution_011 {
    public boolean solution(String[] phone_book) {
        int size = phone_book.length;
        
        Arrays.sort(phone_book);
        
        for (int i = 0; i < size - 1; ++i) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        
        return true;
    }
}
