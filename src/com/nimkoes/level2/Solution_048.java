package com.nimkoes.level2;

public class Solution_048 {
    public int solution(int n) {
        int answer = 1;
        
        for (int cnt = 1, bf = 0; cnt++ < n; answer = (answer % 1234567 + bf), bf = answer - bf) ;
        
        return answer % 1234567;
    }
}
