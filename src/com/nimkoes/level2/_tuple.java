package com.nimkoes.level2;

import java.util.*;

public class _tuple {
    public int[] solution(String s) {
        int[] answer;
        
        String[] temp = s.substring(2, s.length() - 2).split("},\\{");
        String[][] str = new String[temp.length][];
        
        HashMap<Integer, LinkedList<String>> hm = new HashMap<>();
        Set<String> set = new HashSet<>();
        LinkedList<String> ll;
        
        for (int i = 0; i < temp.length; ++i) {
            str[i] = temp[i].split(",");
            ll = new LinkedList<>();
            
            Collections.addAll(ll, str[i]);
            hm.put(ll.size(), ll);
        }
        
        answer = new int[hm.size()];
    
        for (int i = 0; i < hm.size(); ++i) {
            for (String string : hm.get(i + 1)) {
                if (!set.contains(string)) {
                    answer[i] = Integer.parseInt(string);
                    set.add(string);
                }
            }
        }
        
        return answer;
    }
}
