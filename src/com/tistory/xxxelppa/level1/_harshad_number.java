package com.tistory.xxxelppa.level1;

public class _harshad_number {
    public boolean solution(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int sum = 0;
        for (char ch : chars) sum += ch - 48;
        
        return x % sum == 0 ? true : false;
    }
}
