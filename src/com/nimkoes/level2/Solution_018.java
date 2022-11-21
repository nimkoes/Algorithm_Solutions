package com.nimkoes.level2;

public class Solution_018 {
    public int solution(String name) {
        int size = name.length();
        int udCount = 0;           // 위 아래 이동 수
        int lrCount = size - 1;    // 좌 우 이동 수
        
        for (int i = 0; i < size; ++i) {
            udCount += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
        }
        
        
        for (int i = 0; i < size; ++i) {
            if (name.charAt(i) != 'A') {
                int next = i + 1;
                while (next < size && name.charAt(next) == 'A') next++;
                int move = 2 * i + size - next;
                lrCount = Math.min(move, lrCount);
            }
        }
        
        return udCount + lrCount;
    }
}
