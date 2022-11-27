package com.nimkoes.programmers.level2;

public class Solution_051 {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; ++i) {
            answer = getLCM(answer, arr[i]);
        }
        
        return answer;
    }
    
    public int getLCM(int n1, int n2) {
        return n1 * n2 / getGCD(n1, n2);
    }
    
    public int getGCD(int n1, int n2) {
        int temp;
        while (n2 != 0) {
            temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        
        return n1;
    }
}
