package com.nimkoes.level2;

public class Solution_033 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb;
        char[] temp;
        
        while (s.length() != 1) {
            sb = new StringBuilder();
            temp = s.toCharArray();
            ++answer[0];
            
            for (char c : temp) {
                if (c == '1') sb.append("1");
                else ++answer[1];
            }
            s = Integer.toBinaryString(sb.length());
        }
        
        return answer;
    }
}
