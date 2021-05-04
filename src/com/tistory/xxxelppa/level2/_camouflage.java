package com.tistory.xxxelppa.level2;

import java.util.HashMap;

public class _camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String[] s : clothes) hm.put(s[1], hm.getOrDefault(s[1], 1) + 1);
        for (String key : hm.keySet()) answer *= (hm.get(key));
        
        return answer - 1;
    }
}
