package com.nimkoes.programmers.level2;

import java.util.Arrays;

public class Solution_046 {
    public String solution(String s) {
        String[] arrStr = s.split(" ");
        int size = arrStr.length;
        int[] temp = new int[size];
        
        int i = 0;
        for (String elem : arrStr) temp[i++] = Integer.parseInt(elem);
        Arrays.sort(temp);
        
        return temp[0] + " " + temp[size - 1];
    }
}
