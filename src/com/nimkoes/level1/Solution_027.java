package com.nimkoes.level1;

public class Solution_027 {
    public boolean solution(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int sum = 0;
        for (char ch : chars) sum += ch - 48;
        
        return x % sum == 0 ? true : false;
    }
}
