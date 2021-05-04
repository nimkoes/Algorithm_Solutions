package com.tistory.xxxelppa.level2;

import java.util.HashMap;

public class _take_a_group_photo {
    private String[] data;
    private HashMap<Character, Integer> hm;
    private boolean[] visited;
    private int[] ch;
    private int answer;
    private final int MEMBERS_COUNT = 8;
    
    public int solution(int n, String[] data) {
        this.data = data;
        hm = new HashMap<>();
        visited = new boolean[MEMBERS_COUNT];
        ch = new int[MEMBERS_COUNT];
        
        hm.put('A', 0);
        hm.put('C', 1);
        hm.put('F', 2);
        hm.put('J', 3);
        hm.put('M', 4);
        hm.put('N', 5);
        hm.put('R', 6);
        hm.put('T', 7);
        
        makeAnswer(0);
        
        return answer;
    }
    
    public void makeAnswer(int index) {
        if (index == MEMBERS_COUNT) {
            if (check()) ++answer;
        } else {
            for (int i = 0; i < MEMBERS_COUNT; ++i) {
                if (!visited[i]) {
                    visited[i] = true;
                    ch[index] = i;
                    makeAnswer(index + 1);
                    visited[i] = false;
                }
            }
        }
    }
    
    public boolean check() {
        int a, b, result;
        char c;
        
        for (String s : data) {
            a = ch[hm.get(s.charAt(0))];
            b = ch[hm.get(s.charAt(2))];
            
            c = s.charAt(3);
            result = s.charAt(4) - '0' + 1;
            
            if (c == '=') {
                if (Math.abs(a - b) != result) return false;
            } else if (c == '>') {
                if (Math.abs(a - b) <= result) return false;
            } else {
                if (Math.abs(a - b) >= result) return false;
            }
        }
        
        return true;
    }
}
