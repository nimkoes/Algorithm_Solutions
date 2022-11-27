package com.nimkoes.programmers.level2;

import java.util.HashMap;

public class Solution_017 {
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        HashMap<String, Integer> hm_str1 = getGroup(str1);
        HashMap<String, Integer> hm_str2 = getGroup(str2);
        
        if (hm_str1.size() == 0 && hm_str2.size() == 0) return 65536;
        if (hm_str1.size() == 0 || hm_str2.size() == 0) return 0;
        
        int intersection_size = 0;
        int union_size = 0;
        
        for (String s : hm_str1.keySet()) {
            if (hm_str2.containsKey(s)) {
                intersection_size += Math.min(hm_str1.get(s), hm_str2.get(s));
                union_size += Math.max(hm_str1.get(s), hm_str2.get(s));
                hm_str2.remove(s);
            } else {
                union_size += hm_str1.get(s);
            }
        }
        for (String s : hm_str2.keySet()) union_size += hm_str2.get(s);
        double temp = (double) intersection_size / union_size * 65536;
        return (int) temp;
    }
    
    
    private HashMap<String, Integer> getGroup(String str) {
        HashMap<String, Integer> result = new HashMap<>();
        
        for (int i = 0; i < str.length() - 1; ++i) {
            int aNum_1 = str.charAt(i);
            int aNum_2 = str.charAt(i + 1);
            
            if (aNum_1 < 97 || aNum_1 > 122) continue;
            if (aNum_2 < 97 || aNum_2 > 122) {
                ++i;
                continue;
            }
            
            String temp = str.substring(i, i + 2);
            result.put(temp, result.getOrDefault(temp, 0) + 1);
        }
        
        return result;
    }
}
