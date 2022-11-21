package com.nimkoes.level2;

public class Solution_042 {
    char[] num = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        
        String temp = "0";
        int t_cnt = 0;
        int turn = 1;
        
        for (int dNum = 0; t_cnt < t; ++dNum) {
            for (int j = 0; j < temp.length(); ++j) {
                if (turn == p) {
                    sb.append(temp.charAt(j));
                    if (++t_cnt == t) return sb.toString();
                }
                if (turn == m) turn = 1;
                else ++turn;
            }
            temp = getN(dNum, n);
        }
        return sb.toString();
    }
    
    public String getN(int i, int n) {
        StringBuilder sb = new StringBuilder();
        while (i != 0) {
            sb.append(num[i % n]);
            i = i / n;
        }
        return sb.reverse().toString();
    }
}
